package io.github.sandeeplakka.mockify.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SchemaForm {

    private List<ModelForm> models = new ArrayList<>();

}
