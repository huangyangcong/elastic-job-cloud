/*
 * Copyright 1999-2015 dangdang.com.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * </p>
 */

package io.elasticjob.cloud.scheduler.state.failover;

import io.elasticjob.cloud.context.TaskContext;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * 待失效转移任务节点信息.
 *
 * @author liguangyun
 */
@RequiredArgsConstructor
@Getter
public final class FailoverTaskInfo {
    
    private final TaskContext.MetaInfo taskInfo;
    
    private final String originalTaskId;
}
