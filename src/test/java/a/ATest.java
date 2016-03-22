package a;

import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ATest {

    @Test
    public void abc() {
        assertThat(true).isEqualTo(true);
    }
}
