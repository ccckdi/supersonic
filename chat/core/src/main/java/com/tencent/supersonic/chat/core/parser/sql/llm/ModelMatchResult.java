package com.tencent.supersonic.chat.core.parser.sql.llm;

import lombok.Data;

@Data
public class ModelMatchResult {
    private Integer count = 0;
    private double maxSimilarity;
}
