/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.cr.v20180321.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTaskStatusResponse  extends AbstractModel{

    /**
    * 任务结果
    */
    @SerializedName("TaskResult")
    @Expose
    private String TaskResult;

    /**
    * <p>任务类型：</p><ul style="margin-bottom:0px;"><li>报告下载：001</li><li>催收数据上传：002</li><li>还款数据上传：003</li><li>回访数据上传：004</li></ul>
    */
    @SerializedName("TaskType")
    @Expose
    private String TaskType;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * 获取任务结果
     * @return TaskResult 任务结果
     */
    public String getTaskResult() {
        return this.TaskResult;
    }

    /**
     * 设置任务结果
     * @param TaskResult 任务结果
     */
    public void setTaskResult(String TaskResult) {
        this.TaskResult = TaskResult;
    }

    /**
     * 获取<p>任务类型：</p><ul style="margin-bottom:0px;"><li>报告下载：001</li><li>催收数据上传：002</li><li>还款数据上传：003</li><li>回访数据上传：004</li></ul>
     * @return TaskType <p>任务类型：</p><ul style="margin-bottom:0px;"><li>报告下载：001</li><li>催收数据上传：002</li><li>还款数据上传：003</li><li>回访数据上传：004</li></ul>
     */
    public String getTaskType() {
        return this.TaskType;
    }

    /**
     * 设置<p>任务类型：</p><ul style="margin-bottom:0px;"><li>报告下载：001</li><li>催收数据上传：002</li><li>还款数据上传：003</li><li>回访数据上传：004</li></ul>
     * @param TaskType <p>任务类型：</p><ul style="margin-bottom:0px;"><li>报告下载：001</li><li>催收数据上传：002</li><li>还款数据上传：003</li><li>回访数据上传：004</li></ul>
     */
    public void setTaskType(String TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * 获取唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * 设置唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskResult", this.TaskResult);
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

