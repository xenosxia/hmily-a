package org.dromara.hmily.core.context;

import java.util.Map;

/**
 * 上下文参数设置.
 *
 * @author xenosxia
 */
@FunctionalInterface
public interface HmilyInvocationContextParamSet {
    /**
     * 设置上下文参数.
     *
     * @param map not null
     * @return Boolean
     */
    Boolean setContextParam(Map<String, Object> map);
}
