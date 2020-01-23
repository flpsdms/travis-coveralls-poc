package business;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class Calculator {

    public Integer sum(final List<Integer> integers) {
        return Optional.ofNullable(integers).orElse(Collections.emptyList()).isEmpty() ? 0 : integers.stream().mapToInt(Integer::intValue).sum();
    }
}
