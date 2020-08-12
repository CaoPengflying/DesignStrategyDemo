package cpf.zzc.virtualwallet.util;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class GenerateService {
    public static void generate(String entityName, String entityPath) throws IOException {
        StringBuffer entityContent = new StringBuffer();
        entityContent.append("package cpf.zzc.virtualwallet.service;").append("\r\n").append("\r\n");

        entityContent.append("import com.baomidou.mybatisplus.extension.service.IService;\n");
        entityContent.append("import cpf.zzc.virtualwallet.entity.").append(entityName).append(";\r\n");
        entityContent.append("public interface ").append(entityName).append("Service").append(" extends IService<").append(entityName).append("> {");
        entityContent.append("\r\n");
        entityContent.append("}\r\n");
        FileWriter fw = new FileWriter(entityPath + entityName + "Service.java");
        PrintWriter pw = new PrintWriter(fw);
        pw.println(entityContent);
        pw.flush();
        StringBuffer serviceImplContent = new StringBuffer();
        serviceImplContent.append("package cpf.zzc.virtualwallet.service.impl;").append("\r\n").append("\r\n");

        serviceImplContent.append("import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;\n");
        serviceImplContent.append("import cpf.zzc.virtualwallet.mapper.").append(entityName).append("Mapper;\r\n");
        serviceImplContent.append("import cpf.zzc.virtualwallet.entity.").append(entityName).append(";\r\n");
        serviceImplContent.append("import cpf.zzc.virtualwallet.service.").append(entityName).append("Service;\r\n");
        serviceImplContent.append("import org.springframework.stereotype.Service;\r\n");
        serviceImplContent.append("@Service").append("\r\n");
        serviceImplContent.append("public class ").append(entityName).append("ServiceImpl").append(" extends ServiceImpl<")
                .append(entityName).append("Mapper, ").append(entityName).append(">")
                .append(" implements ").append(entityName).append("Service ").append(" {");
        serviceImplContent.append("\r\n");
        serviceImplContent.append("}\r\n");
        fw = new FileWriter(entityPath +"impl/"+ entityName + "ServiceImpl.java");
        pw = new PrintWriter(fw);
        pw.println(serviceImplContent);
        pw.flush();
    }
}
