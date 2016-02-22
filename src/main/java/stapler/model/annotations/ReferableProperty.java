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
 * @since Feb 21, 2016 3:06:55 AM
 */
package stapler.model.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * <p>Indicates the <i>properties</i> (i.e., attributes and relationships) that are associated with an included referable entity.</p>
 * <p>By default, each non-static field of a class is referable unless explicity excluded by the {@link ExcludeFromPolicy} annotation. Annotation of static fields may yield an error whenever the domain model is composed.</p> 
 * @author Jasper Bogaerts
 * @since Feb 21, 2016
 *
 */
@Retention(RetentionPolicy.CLASS)
@Target({ElementType.FIELD})
@Inherited
public @interface ReferableProperty {
	/**
	 * Specifies how this property can be referred to in the policy. By default, this will be the name of the field of the class.
	 * @author Jasper Bogaerts
	 * @since Feb 21, 2016
	 */
	String name() default "";
	
	/**
	 * <p>Specifies the duration at which the values of this property can be cached by PIPs, PDPs, and other components.</p>
	 * <p>Note that when this involves a <i>relationship</i> with another entity, this will only target the cache duration of the identifier that designates this relationship.</p>
	 * @author Jasper Bogaerts
	 * @since Feb 21, 2016
	 */
	CacheDurationType cacheDuration() default CacheDurationType.FOREVER;
	
	/**
	 * <p>Specifies how many items the property should minimally reflect.</p> 
	 * <p><b>Note:</b> this is only applicable for {@link Collection} fields.</p>
	 * <p><b>Note:</b> special care should be taken for the initialization and lifecycle of the field that reflects the attribute. For instance, if the values for the field are set by means of an action that is constrained by the policy, or requires a lookup of this attribute in any way, then an error can occur. Because of this, we advise to only set this property when the values for this field are set prior to any access control checks and subsequent modification always satisfies this assertion.</p>
	 * @author Jasper Bogaerts
	 * @since Feb 22, 2016
	 */
	int minOccurs() default 0;
	
	/**
	 * <p>Specifies how many items the property should maximally reflect.</p> 
	 * <p><b>Note:</b> this is only applicable for {@link Collection} fields.</p>
	 * <p><b>Note:</b> special care should be taken for the initialization and lifecycle of the field that reflects the attribute. For instance, if the values for the field are set by means of an action that is constrained by the policy, or requires a lookup of this attribute in any way, then an error can occur. Because of this, we advise to only set this property when the values for this field are set prior to any access control checks and subsequent modification always satisfies this assertion.</p>
	 * @author Jasper Bogaerts
	 * @since Feb 22, 2016
	 */
	int maxOccurs() default Integer.MAX_VALUE;
}
