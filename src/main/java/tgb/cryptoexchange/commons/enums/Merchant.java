package tgb.cryptoexchange.commons.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum Merchant {
    ALFA_TEAM("AlfaTeam"),
    ALFA_TEAM_WT("AlfaTeam WT"),
    ONLY_PAYS("OnlyPays"),
    EVO_PAY("EvoPay"),
    NICE_PAY("NicePay"),
    HONEY_MONEY("HoneyMoney"),
    WELL_BIT("WellBit"),
    CROCO_PAY("CrocoPay"),
    BIT_ZONE("BitZone"),
    ONYX_PAY("OnyxPay"),
    EXTASY_PAY("ExtasyPay"),
    PAY_LEE("PayLee"),
    PSP_WARE("PSPWare"),
    PAY_CROWN("PayCrown"),
    PAYSCROW("Payscrow"),
    PAYSCROW_HIGH_CHECK("Payscrow High Check"),
    PAYSCROW_WHITE_TRIANGLE("Payscrow WT"),
    PAYSCROW_SIM("Payscrow SIM"),
    LUCKY_PAY("LuckyPay"),
    APPEXBIT("Appexbit"),
    MOBIUS("Mobius"),
    YA_PAY("YaPay"),
    DAO_PAYMENTS("DaoPayments"),
    GEO_TRANSFER("GeoTransfer"),
    ROSTRAST("Rostrast"),
    FOX_PAYS("FoxPays"),
    STORM_TRADE("StormTrade"),
    SETTLE_X("SettleX"),
    AURORA_PAY("AuroraPay"),
    PLATA_PAYMENT("Plata Payment"),
    PLATA_18("Plata 18"),
    PAY_LEE_QR("PayLee QR"),
    NEURAL_PAY("NeuralPay"),
    STUDIO("Studio")
    ;

    private final String displayName;
}
