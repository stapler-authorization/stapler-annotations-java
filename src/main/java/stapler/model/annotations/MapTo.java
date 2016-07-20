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
 * @since Jul 15, 2016 3:53:14 PM
 */
package stapler.model.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * <p>Annotation used to specify the mapping of a field onto a database. This can be used to determine how the values corresponding to properties should be retrieved from the database.</p>
 * <p>Note that this annotation is not necessary when ORMs such as JPA are used, as these will be sufficient to determine how to retrieve the values corresponding to the properties of an entity type.</p>
 * 
 * @author Jasper Bogaerts
 * @since Jul 15, 2016
 *
 */
@Retention(RetentionPolicy.SOURCE)
@Target({ElementType.FIELD})
@Inherited
public @interface MapTo {
	/**
	 * <p>Specifies the database name that will be used to find the values corresponding to the annotated property.</p>
	 * @author Jasper Bogaerts
	 * @since Jul 15, 2016
	 */
	String database() default "";
	/**
	 * <p>Specifies the table name that will be used to find the values corresponding to the annotated property.</p> 
	 * @author Jasper Bogaerts
	 * @since Jul 15, 2016
	 */
	String table();
	/**
	 * <p>Specifies the column name that will be used to find the values corresponding to the annotated property.</p> 
	 * @author Jasper Bogaerts
	 * @since Jul 15, 2016
	 */
	String column();
	/**
	 * <p>Specifies the constraint that is used to obtain data when the specified column can contain other properties as well.</p>
	 * <p>For example, consider a table with the following columns: <i>entity_id</i>, <i>property_id</i>, and <i>property_value</i>. In this scenario, the property may map onto the same column as another property. Hence, a <b>constraint</b> can be specified to filter out the results. For example, such a constraint can be <i>property_id = 'departments'</i>.</p>
	 * <p>Constraints should always be of the form <i>column_name = &lt;value&gt;</i> in which <i>&lt;value&gt;</i> is a concrete value that designates the contents that identify the property. Since it will be included directly in a query that is performed by the {@link PIP} without further validation, it is <b>vital</b> that this should be included only when the utmost care is taken.</p> 
	 * @author Jasper Bogaerts
	 * @since Jul 15, 2016
	 */
	String constraint() default "";
}
