package cpf.zzc.virtualwallet.util;

import org.apache.commons.lang3.StringUtils;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by emmet on 17-3-29.
 * desc:
 */
public class GenerateEntity {
    /**
     * 下划线正则表达式
     */
    private static Pattern pattern = Pattern.compile("([A-Za-z\\d]+)(_)?");
    private static Pattern blankPattern = Pattern.compile("\\s*|\t|\r|\n");
    //生成实体类
    public static void generate(String entityName, String entityPackage, String entityPath, String databaseName,
                                String tableName, String primaryKey, List<String> colnames, List<String> colTypes, List<String> colComments, boolean importDate) throws IOException {
        StringBuffer entityContent = new StringBuffer();
        entityContent.append("package cpf.zzc.virtualwallet.entity;").append("\r\n").append("\r\n");

        entityContent.append("import com.baomidou.mybatisplus.annotation.IdType;\r\n");
        entityContent.append("import lombok.*;\r\n");
        entityContent.append("import com.baomidou.mybatisplus.annotation.TableField;\r\n");
        entityContent.append("import com.baomidou.mybatisplus.annotation.TableId;\r\n");
        entityContent.append("import com.baomidou.mybatisplus.annotation.TableName;\r\n");
        entityContent.append("import java.io.Serializable;\r\n");
        entityContent.append("import java.math.BigDecimal;\r\n");
        if (importDate) {
            entityContent.append("import java.util.Date;\r\n").append("\r\n");
        }
        entityContent.append("@TableName(value = \"").append(tableName).append(
                "\")").append("\r\n");
        entityContent.append("@Getter").append("\r\n");
        entityContent.append("@Setter").append("\r\n");
        entityContent.append("@NoArgsConstructor").append("\r\n");
        entityContent.append("@AllArgsConstructor").append("\r\n");
        entityContent.append("@ToString").append("\r\n");
        entityContent.append("public class ").append(entityName).append(" implements Serializable").append(" {").append("\r" +
                "\n");
        for (int i = 0; i < colnames.size(); i++) {
            String colComment = colComments.get(i);
            if (StringUtils.isNotEmpty(colComment)){
                Matcher m = blankPattern.matcher(colComment);
                colComment = m.replaceAll("");
                entityContent.append("\t/**\r\n").append("\t * ").append(colComment).append("\r\n").append(
                        "\t */").append("\r\n");
            }
            String columnName = underline2Camel(colnames.get(i));
            if (primaryKey.equals(columnName)) {
                entityContent.append("\t@TableId(value = \""+colnames.get(i)+"\", type = IdType.AUTO)"+"\r\n");
            }else {
                entityContent.append("\t@TableField(\"" + colnames.get(i) + "\")\r\n");
            }
            entityContent.append("\tprivate ").append(getType(colTypes.get(i))).append(" ").append(columnName)
                    .append(";").append("\r\n");
        }
        entityContent.append("\r\n");
        entityContent.append("}\r\n");
        FileWriter fw = new FileWriter(entityPath + entityName + ".java");
        PrintWriter pw = new PrintWriter(fw);
        pw.println(entityContent);
        pw.flush();
    }

    //根据SQL类型获取java类型
    private static String getType(String sqlType) {
        switch (sqlType) {
            case "tinyint":
                return "Boolean";
            case "smallint":
            case "int":
            case "integer":
            case "char":
                return "Integer";
            case "bigint":
                return "Long";
            case "float":
            case "double":
            case "decimal":
            case "numeric":
                return "BigDecimal";
            case "varchar":
            case "text":
            case "mediumtext":
                return "String";
            case "date":
            case "time":
            case "datetime":
            case "timestamp":
                return "Date";
            default:
                System.out.println("ERROR DATA TYPE : " + sqlType);
                return null;
        }
    }

    //把输入字符串的首字母改成大写
    private static String initcap(String str) {
        char[] ch = str.toCharArray();
        if (ch[0] >= 'a' && ch[0] <= 'z'){
            ch[0] = (char) (ch[0] - 32);
        }
        return new String(ch);
    }

    //下划线转首字母大写
    public static String underline2Camel(String line) {
        if (line == null || "".equals(line)){
            return "";
        }
        StringBuffer sb = new StringBuffer();
        Matcher matcher = pattern.matcher(line);
        while (matcher.find()) {
            String word = matcher.group();
            sb.append(matcher.start() == 0 ? Character.toLowerCase(word.charAt(0)) : Character.toUpperCase(word.charAt(0)));
            int index = word.lastIndexOf('_');
            if (index > 0) {
                sb.append(word.substring(1, index).toLowerCase());
            } else {
                sb.append(word.substring(1).toLowerCase());
            }
        }
        return sb.toString();
    }
}
