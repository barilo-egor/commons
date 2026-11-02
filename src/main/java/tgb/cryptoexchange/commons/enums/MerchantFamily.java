package tgb.cryptoexchange.commons.enums;

import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Set;

/**
 * Семейства мерчантов: варианты одного мерчанта (методы, лимиты, отдельные аккаунты).
 * <p>
 * merchant-details может присылать КБ варианта под именем другого мерчанта семейства. Например, все варианты
 * ExtasyPay присылают КБ как {@link Merchant#EXTASY_PAY}, поэтому ордер по КБ ищется среди всех мерчантов
 * семейства. Каждый мерчант входит ровно в одно семейство.
 */
public enum MerchantFamily {
    ALFA_TEAM(Merchant.ALFA_TEAM, Merchant.ALFA_TEAM_WT, Merchant.ALFA_TEAM_QR),
    ONLY_PAYS(Merchant.ONLY_PAYS),
    EVO_PAY(Merchant.EVO_PAY),
    HONEY_MONEY(Merchant.HONEY_MONEY),
    CROCO_PAY(Merchant.CROCO_PAY),
    BIT_ZONE(Merchant.BIT_ZONE),
    ONYX_PAY(Merchant.ONYX_PAY),
    EXTASY_PAY(
            Merchant.EXTASY_PAY,
            Merchant.EXTASY_PAY_RECEIPT,
            Merchant.EXTASY_PAY_RECEIPT_3,
            Merchant.EXTASY_PAY_QR
    ),
    PAY_LEE(Merchant.PAY_LEE, Merchant.PAY_LEE_QR),
    PAYSCROW(
            Merchant.PAYSCROW,
            Merchant.PAYSCROW_HIGH_CHECK,
            Merchant.PAYSCROW_WHITE_TRIANGLE,
            Merchant.PAYSCROW_SIM,
            Merchant.PAYSCROW_LOW,
            Merchant.PAYSCROW_TRANSGRAN
    ),
    GEO_TRANSFER(Merchant.GEO_TRANSFER),
    ROSTRAST(Merchant.ROSTRAST),
    STORM_TRADE(Merchant.STORM_TRADE, Merchant.STORM_TRADE_13),
    SETTLE_X(Merchant.SETTLE_X, Merchant.SETTLE_X_15),
    PLATA(Merchant.PLATA_PAYMENT, Merchant.PLATA_18),
    YOLO(Merchant.YOLO, Merchant.YOLO_SIM),
    NOROS(Merchant.NOROS, Merchant.NOROS_HIGH_CHECK),
    FIAT_CUT(Merchant.FIAT_CUT),
    CASH_OUT(Merchant.CASH_OUT),
    PW_PAY(Merchant.PW_PAY),
    GOAT_X(Merchant.GOAT_X, Merchant.GOAT_X_SIM),
    LOTRIEN(Merchant.LOTRIEN, Merchant.LOTRIEN_PDF),
    GAMBIT(Merchant.GAMBIT, Merchant.GAMBIT_SIM),
    ASGARD(Merchant.ASGARD, Merchant.ASGARD_WT, Merchant.ASGARD_SIM, Merchant.ASGARD_HIGH_CHECK),
    DEORA(Merchant.DEORA, Merchant.DEORA_SIM, Merchant.DEORA_LOW_CHECK, Merchant.DEORA_PDF),
    MERIDIAN_PAY(
            Merchant.MERIDIAN_PAY,
            Merchant.MERIDIAN_PAY_HIGH_CHECK,
            Merchant.MERIDIAN_PAY_LOW_CHECK,
            Merchant.MERIDIAN_PAY_SIM,
            Merchant.MERIDIAN_PAY_NSPK
    ),
    SOUZ(Merchant.SOUZ, Merchant.SOUZ_SBP_QR, Merchant.SOUZ_SIM, Merchant.SOUZ_PDF),
    BASE_51(Merchant.BASE_51, Merchant.BASE_51_SIM, Merchant.BASE_51_LOW_CHECK, Merchant.BASE_51_HIGH_CHECK),
    PRISMA_PAY(Merchant.PRISMA_PAY),
    BUCKS_PAY(Merchant.BUCKS_PAY, Merchant.BUCKS_PAY_SIM),
    MANY_PAY(Merchant.MANY_PAY, Merchant.MANY_PAY_HIGH_CHECK, Merchant.MANY_PAY_LOW_CHECK),
    PAYSYNC(Merchant.PAYSYNC),
    CUBE(Merchant.CUBE, Merchant.CUBE_LOW_CHECK, Merchant.CUBE_HIGH_CHECK, Merchant.CUBE_SIM),
    RS_PAY(Merchant.RS_PAY, Merchant.RS_PAY_BT),
    WAT(Merchant.WAT, Merchant.WAT_SIM, Merchant.WAT_PDF),
    TRON_EX(
            Merchant.TRON_EX_SIM,
            Merchant.TRON_EX_BT,
            Merchant.TRON_EX_QR,
            Merchant.TRON_EX_PDF,
            Merchant.TRON_EX_DEEP_LINK
    ),
    PRIME_WALLET(Merchant.PRIME_WALLET, Merchant.PRIME_WALLET_LOW_CHECK, Merchant.PRIME_WALLET_HIGH_CHECK),
    BAY_PAY(Merchant.BAY_PAY, Merchant.BAY_PAY_LOW_CHECK, Merchant.BAY_PAY_HIGH_CHECK),
    HESOYAM(Merchant.HESOYAM, Merchant.HESOYAM_SIM),
    HELLBIT(Merchant.HELLBIT, Merchant.HELLBIT_BT),
    SMACK_PAY(Merchant.SMACK_PAY),
    BIT_BOLIDE(Merchant.BIT_BOLIDE, Merchant.BIT_BOLIDE_DEEP_LINK, Merchant.BIT_BOLIDE_WT),
    VIATRUM(Merchant.VIATRUM);

    private final Set<Merchant> merchants;

    MerchantFamily(Merchant first, Merchant... rest) {
        this.merchants = Collections.unmodifiableSet(EnumSet.of(first, rest));
    }

    /**
     * @return мерчанты семейства
     */
    public Set<Merchant> getMerchants() {
        return merchants;
    }

    /**
     * Возвращает семейство мерчанта.
     *
     * @param merchant мерчант
     * @return семейство, в которое входит мерчант
     * @throws IllegalArgumentException если мерчант не входит ни в одно семейство
     */
    public static MerchantFamily of(Merchant merchant) {
        return Arrays.stream(values())
                .filter(family -> family.merchants.contains(merchant))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Не задано семейство мерчанта " + merchant));
    }
}
