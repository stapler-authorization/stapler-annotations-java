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
 * @since Feb 21, 2016 2:02:19 AM
 */
package stapler.model.annotations;

import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;

/**
 * Specifies whether the target is an entity type that can be addressed from the access control policy
 * 
 * @author Jasper Bogaerts
 * @since Feb 21, 2016
 *
 */
@Retention(RetentionPolicy.CLASS)
@Target({ElementType.TYPE})
@Inherited
public @interface DomainEntity {
	/**
	 * Specifies whether the given entity type should be referable in the policy.
	 * @author Jasper Bogaerts
	 * @since Feb 21, 2016
	 *
	 * @return True if referable, false if the entity type cannot be addressed.
	 */
	boolean referable() default true;
	
	/**
	 * <p>Specifies the alternative name under which the entity type will be referred.</p>
	 * <p>There are several important notes to take into account for this:</p>
	 * <ul>
	 * 	<li>If the <code>referable</code> argument is set to <code>false</code>, this alternative name will not be taken into account as the entity type will not be included as part of the domain model anyway.</li>
	 *  <li>If no name is specified, the entity type will be included in the domain model (barring any overriding exclusion rules) under the original simple name (<i>not</i> the FQN) of the annotated type.</li>
	 *  <li>Several reserved words cannot be used as entity type names. We refer to online documentation for this.</li>
	 *  <li>Beware not to include duplicate names for the domain model! This will lead to errors in parsing it.</li>
	 * </ul> 
	 * @author Jasper Bogaerts
	 * @since Jul 14, 2016
	 *
	 * @return
	 */
	String name() default "";
}
