/*-
 * #%L
 * TESLERDOC - Source
 * %%
 * Copyright (C) 2020 Tesler Contributors
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

package io.tesler.dto;

import io.tesler.api.data.dto.DataResponseDTO;
import io.tesler.core.dict.TDDictionaryType;
import io.tesler.core.util.filter.SearchParameter;
import io.tesler.entity.ForceActiveExample;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import static io.tesler.core.util.filter.SearchParameterType.LOV;

@Getter
@Setter
@NoArgsConstructor
public class ForceActiveExampleDTO extends DataResponseDTO {

	@SearchParameter(type = LOV)
	@TDLov(TDDictionaryType.COUNTRY)
	private String country;

	@SearchParameter(type = LOV)
	@TDLov(TDDictionaryType.LANGUAGE)
	private String language;

	public ForceActiveExampleDTO(ForceActiveExample entity) {
		this.id = entity.getId().toString();
		this.country = TDDictionaryType.COUNTRY.lookupValue(entity.getCountry());
		this.language = TDDictionaryType.LANGUAGE.lookupValue(entity.getLanguage());
	}

}
