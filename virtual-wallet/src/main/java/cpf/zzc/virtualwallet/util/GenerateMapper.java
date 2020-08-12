package cpf.zzc.virtualwallet.util;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class GenerateMapper {
    public static void generate(String entityName,String entityPath) throws IOException {
        StringBuffer entityContent = new StringBuffer();
        entityContent.append("package cpf.zzc.virtualwallet.mapper;").append("\r\n").append("\r\n");

        entityContent.append("import com.baomidou.mybatisplus.core.mapper.BaseMapper;\n");
        entityContent.append("import cpf.zzc.virtualwallet.entity.").append(entityName).append(";\r\n");
        entityContent.append("import org.springframework.stereotype.Repository;\r\n\r\n");
        entityContent.append("@Repository\r\n");
        entityContent.append("public interface ").append(entityName).append("Mapper").append(" extends BaseMapper<").append(entityName).append("> {");
        entityContent.append("\r\n");
        entityContent.append("}\r\n");
        FileWriter fw = new FileWriter(entityPath + entityName + "Mapper.java");
        PrintWriter pw = new PrintWriter(fw);
        pw.println(entityContent);
        pw.flush();
    }
}
