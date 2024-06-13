package co.com.ludi.api.api;

import co.com.ludi.model.field.Field;
import co.com.ludi.usecase.field.GetFieldUseCase;
import co.com.ludi.usecase.field.SaveFieldUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

import static co.com.ludi.api.common.ResponseHandler.encapsulateResponse;

@RestController
@RequestMapping(value = "/field", produces = MediaType.APPLICATION_JSON_VALUE)
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PATCH})
@RequiredArgsConstructor
public class FieldController {

    private final GetFieldUseCase getFieldUseCase;
    private final SaveFieldUseCase saveFieldUseCase;

    @GetMapping(path = "/{fieldId}")
    public Mono<ResponseEntity<Object>> getFieldById(@PathVariable String fieldId) {
        return this.getFieldUseCase.findById(fieldId)
                .map(response -> encapsulateResponse(response, HttpStatus.OK));
    }

    @GetMapping()
    public Mono<ResponseEntity<Object>> getAllFields() {
        return this.getFieldUseCase.findAll()
                .collectList()
                .map(response -> encapsulateResponse(response, HttpStatus.OK));
    }

    @PostMapping()
    public Mono<ResponseEntity<Object>> saveField(@RequestBody Field field) {
        return this.saveFieldUseCase.save(field)
                .map(response -> encapsulateResponse(response, HttpStatus.CREATED));
    }
}
