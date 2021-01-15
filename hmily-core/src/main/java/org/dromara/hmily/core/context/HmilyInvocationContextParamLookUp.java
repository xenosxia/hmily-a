package org.dromara.hmily.core.context;

import java.util.Map;

/**
 * 上下文参数获取.
 *
 * @author xenosxia
 */
@FunctionalInterface
public interface HmilyInvocationContextParamLookUp {
    /**
     * 获取上下文待设置参数.
     *
     * @return Map
     */
    Map<String, Object> getContextParams();
}
