package cpf.zzc.virtualwallet.util;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.google.common.collect.Lists;

import java.util.List;

/**
 * date 2020/8/11
 *
 * @author caopengflying
 */
public class ModelConvertUtils {

    /**
     * 单个对象转换
     *
     * @param sourceModel 入参对象
     * @param clazz       出参类型
     * @return
     */
    public static <R> R convert(Object sourceModel, Class<R> clazz) {
        return convertList(Lists.newArrayList(sourceModel), clazz).get(0);
    }

    /**
     * list对象转换
     *
     * @param sourceModelList 入参对象
     * @param clazz           出参类型
     * @return
     */
    public static <R, T> List<R> convertList(List<T> sourceModelList, Class<R> clazz) {
        return JSONArray.parseArray(JSON.toJSONString(sourceModelList)).toJavaList(clazz);
    }
}
