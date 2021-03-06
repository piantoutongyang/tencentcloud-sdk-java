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
package com.tencentcloudapi.bmlb.v20180625.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UnbindTrafficMirrorListenersResponse  extends AbstractModel{

    /**
    * 任务ID。该接口为异步任务，可根据本参数调用DescribeLoadBalancerTaskResult接口来查询任务操作结果。
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * 获取任务ID。该接口为异步任务，可根据本参数调用DescribeLoadBalancerTaskResult接口来查询任务操作结果。
     * @return TaskId 任务ID。该接口为异步任务，可根据本参数调用DescribeLoadBalancerTaskResult接口来查询任务操作结果。
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * 设置任务ID。该接口为异步任务，可根据本参数调用DescribeLoadBalancerTaskResult接口来查询任务操作结果。
     * @param TaskId 任务ID。该接口为异步任务，可根据本参数调用DescribeLoadBalancerTaskResult接口来查询任务操作结果。
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
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
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

