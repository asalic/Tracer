package es.upv.grycap.tracer.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
public class TraceCreateDataset extends TraceDataset {
	
	@JsonIgnore
	private static final long serialVersionUID = 554105358293232533L;

	protected List<TraceResource> traceResources;
}
