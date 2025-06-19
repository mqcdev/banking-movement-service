package com.nttdata.banking.movement.application;

import com.nttdata.banking.movement.dto.MovementDto;
import com.nttdata.banking.movement.model.Movement;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * Class MovementService.
 * Movement microservice class MovementService.
 */
public interface MovementService {
    public Flux<Movement> findAll();

    public Mono<Movement> findById(String idMovement);

    public Mono<MovementDto> findLastMovementsByAccountNumber(String accountNumber);

    public Mono<Movement> save(MovementDto movementDto);

    public Mono<Movement> saveMobileWallet(MovementDto movementDto);

    public Mono<Movement> saveCreditLoan(MovementDto movementDto);

    public Mono<Movement> update(MovementDto movementDto, String idMovement);

    public Mono<Movement> updateCreditCardLoan(MovementDto movementDto, String idMovement);

    public Mono<Void> delete(String idMovement);

    public Flux<MovementDto> findMovementsByAccountNumber(String accountNumber);

    public Mono<Movement> creditByCreditNumber(Integer creditNumber);

    public Flux<MovementDto> findMovementsByLoanNumber(String accountNumber);

    public Flux<MovementDto> findMovementsByCreditNumber(Integer creditNumber);

}
