package io.milvus.v2.service.vector.response;

import lombok.Data;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
public class InsertResp {
    private long InsertCnt;
}
