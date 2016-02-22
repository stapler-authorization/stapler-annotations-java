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
 * @since Feb 21, 2016 3:16:42 AM
 */
package stapler.model.annotations;

/**
 * <p>Indicates the duration at which an item can be cached.</p>
 * <p>Note that the durations are configurable (apart from {@code FOREVER} and {@code NONE}) for each component type.</p>
 * @author Jasper Bogaerts
 * @since Feb 21, 2016
 *
 */
public enum CacheDurationType {
	/**
	 * Indicates that the item should be cached indefinately (i.e., it is never invalidated.)
	 */
	FOREVER,
	/**
	 * Indicates that the item should never be cached.
	 */
	NONE,
	/**
	 * Indicates that the item should be cached for only a short period.
	 */
	SHORT,
	/**
	 * Indicates that the item should be cached for a medium period.
	 */
	MEDIUM,
	/**
	 * Indicates that the item should be cached for a long period.
	 */
	LONG;
}
