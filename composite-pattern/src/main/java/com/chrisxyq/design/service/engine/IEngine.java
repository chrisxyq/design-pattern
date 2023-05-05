package com.chrisxyq.design.service.engine;


import com.chrisxyq.design.model.aggregates.TreeRich;
import com.chrisxyq.design.model.vo.EngineResult;

import java.util.Map;

public interface IEngine {

    EngineResult process(final Long treeId, final String userId, TreeRich treeRich, final Map<String, String> decisionMatter);

}
