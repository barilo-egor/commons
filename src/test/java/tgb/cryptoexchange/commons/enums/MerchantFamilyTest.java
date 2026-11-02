package tgb.cryptoexchange.commons.enums;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.EnumSource;

import java.util.Arrays;
import java.util.EnumSet;
import java.util.Set;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class MerchantFamilyTest {

    @Test
    @DisplayName("В семействах должно быть столько же мерчантов, сколько в перечислении мерчантов.")
    void families_shouldContainAsManyMerchantsAsMerchantEnum() {
        int merchantsInFamilies = Arrays.stream(MerchantFamily.values())
                .mapToInt(family -> family.getMerchants().size())
                .sum();

        assertEquals(Merchant.values().length, merchantsInFamilies);
    }

    @Test
    @DisplayName("Каждый мерчант должен входить в семейство.")
    void families_shouldCoverAllMerchants() {
        Set<Merchant> merchantsInFamilies = Arrays.stream(MerchantFamily.values())
                .flatMap(family -> family.getMerchants().stream())
                .collect(Collectors.toCollection(() -> EnumSet.noneOf(Merchant.class)));

        assertEquals(EnumSet.allOf(Merchant.class), merchantsInFamilies);
    }

    @ParameterizedTest
    @EnumSource(Merchant.class)
    @DisplayName("Метод должен вернуть семейство, в которое входит мерчант.")
    void of_shouldReturnFamilyContainingMerchant(Merchant merchant) {
        assertTrue(MerchantFamily.of(merchant).getMerchants().contains(merchant));
    }

    @ParameterizedTest
    @CsvSource({
            "EXTASY_PAY,EXTASY_PAY",
            "EXTASY_PAY_RECEIPT_3,EXTASY_PAY",
            "TRON_EX_QR,TRON_EX",
            "TRON_EX_DEEP_LINK,TRON_EX",
            "PLATA_18,PLATA",
            "PAYSCROW_TRANSGRAN,PAYSCROW",
            "PAY_LEE_QR,PAY_LEE",
            "PW_PAY,PW_PAY",
            "VIATRUM,VIATRUM"
    })
    @DisplayName("Метод должен вернуть семейство мерчанта.")
    void of_shouldReturnFamily(Merchant merchant, MerchantFamily expected) {
        assertEquals(expected, MerchantFamily.of(merchant));
    }
}
