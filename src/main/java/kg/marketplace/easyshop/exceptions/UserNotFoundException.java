package kg.marketplace.easyshop.exceptions;

import kg.marketplace.easyshop.dto.ResponseStatusDTO;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class UserNotFoundException extends RuntimeException {

    private final ResponseStatusDTO responseStatusDTO;



}
