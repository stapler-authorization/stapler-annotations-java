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
 * @since Apr 1, 2016 9:38:19 AM
 */
package stapler.model.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * <p>Denotes a set of literal values that will be classified under the annotated type.</p>
 * <p>For example, consider the following enumerator: <br />
 * 		<code>
 * 		public enum DepartmentType {	<br />
 * 			&ensp; accounting,	hr,	<br />
 * 			&ensp; marketing, sales(marketing), communication(marketing), pr(marketing), <br />
 * 			&ensp; helpdesk,	researchAndDevelopment, billing, <br />
 * 			&ensp;  it, infrastructure(it), <br />
 * 			&ensp; production; <br /><br />
 * 			&ensp; public final Department parent; <br /><br />
 * 			&ensp; private Department(Department parent) { <br />
 * 			&ensp; &ensp;&ensp;	this.parent = parent; <br />
 * 			&ensp; } <br /><br />
 * 			&ensp; private Department() { <br />
 * 			&ensp; &ensp;&ensp;	this.parent = null; <br />
 * 			&ensp; } <br /><br />
 * 			&ensp; public Department getParent() { <br />
 * 			&ensp; &ensp;&ensp;	return this.parent; <br />
 * 			&ensp; } <br />
 * 		} <br />
 * 		</code>
 * </p>
 * <p>This can be annotated with {@code @LiteralType}, enabling tight type restrictions in the policy language based on this type of the domain model. When used, only the literals associated with this type will be allowed in the policy based on this model.</p>
 * <p>Note that only {@link Enum} types are supported for this annotation. If a normal class or interface is annotated with this, it will not be included as a literal as part of the domain model.</p>
 * @author Jasper Bogaerts
 * @since Apr 1, 2016
 *
 */
@Retention(RetentionPolicy.CLASS)
@Target({ElementType.TYPE})
@Inherited
public @interface LiteralType {
	
}
