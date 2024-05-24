package co.com.ludi.usecase.sportsCenter;

import co.com.ludi.model.sportscenter.SportsCenter;
import co.com.ludi.model.sportscenter.gateways.ISportsCenterRepository;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
public class SaveSportsCenterUseCase {
    private final ISportsCenterRepository sportsCenterRepository;

    public Mono<SportsCenter> saveSportsCenter(SportsCenter sportsCenter) {
        return this.sportsCenterRepository.save(sportsCenter);
    }
}
