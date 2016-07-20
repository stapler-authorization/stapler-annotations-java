/*******************************************************************************
 * Copyright 2016 KU Leuven Research and Developement - iMinds - Distrinet 
 * 
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 * 
 *        http://www.apache.org/licenses/LICENSE-2.0
 * 
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 *    
 *    Administrative Contact: dnet-project-office@cs.kuleuven.be
 *    Technical Contact: jasper.bogaerts@cs.kuleuven.be
 *    Author: jasper.bogaerts@cs.kuleuven.be
 ******************************************************************************/

/**
 * 
 * @author Jasper Bogaerts
 * @since Jul 15, 2016 12:01:49 PM
 */
package stapler.model.annotations;

/**
 * <p>
 * Specifies whether the target is a package that can be addressed from the access control policy. 
 * </p>
 * <p>
 * Including a package from the policy implies all descendant entity types to be included. This can be overridden by an {@link ExcludeFromPolicy} annotation at the class-level or package-level.
 * </p>
 * @author Jasper Bogaerts
 * @since Jul 15, 2016
 *
 */
public @interface IncludeInPolicy {

}
