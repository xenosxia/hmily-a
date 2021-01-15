package org.dromara.hmily.core.context;

/**
 * 清除上下文参数.
 *
 * @author xenosxia
 */
@FunctionalInterface
public interface HmilyInvocationContextParamClear {
    /**
     * 清除前面设置的参数.
     *
     * @return boolean
     */
    Boolean clearContextParam();
}
