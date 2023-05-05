package com.chrisxyq.design.service.engine.impl;


import com.chrisxyq.design.model.aggregates.TreeRich;
import com.chrisxyq.design.model.vo.EngineResult;
import com.chrisxyq.design.model.vo.TreeNode;
import com.chrisxyq.design.service.engine.EngineBase;

import java.util.Map;

public class TreeEngineHandle extends EngineBase {

    @Override
    public EngineResult process(Long treeId, String userId, TreeRich treeRich, Map<String, String> decisionMatter) {
        // 决策流程
        TreeNode treeNode = engineDecisionMaker(treeRich, treeId, userId, decisionMatter);
        // 决策结果
        return new EngineResult(userId, treeId, treeNode.getTreeNodeId(), treeNode.getNodeValue());
    }

}
