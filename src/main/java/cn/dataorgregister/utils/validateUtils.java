package cn.dataorgregister.utils;

import com.google.common.collect.Lists;
import org.apache.commons.collections.CollectionUtils;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.groups.Default;
import java.util.List;
import java.util.Set;

import static java.util.stream.Collectors.toList;

/**
 * @author ZJ
 * @description
 * @Create by 2022/9/16 17:11
 */
public class validateUtils {
    /**
     * JSR 303 验证
     *
     * @param obj 验证对象
     * @return List<String>
     */
    public static List<String> validation(Object obj) {
        Set<ConstraintViolation<Object>> validateSet =
                Validation.buildDefaultValidatorFactory().getValidator().validate(obj, Default.class);

        if (!CollectionUtils.isEmpty(validateSet)) {
            return validateSet.stream().map(ConstraintViolation::getMessage).collect(toList());
        }
        return Lists.newArrayList();
    }
}
