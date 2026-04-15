package tgb.cryptoexchange.commons.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum Merchant {
    ALFA_TEAM("AlfaTeam"),
    ALFA_TEAM_WT("AlfaTeam WT"),
    ALFA_TEAM_QR("AlfaTeam QR"),
    ONLY_PAYS("OnlyPays"),
    EVO_PAY("EvoPay"),
    HONEY_MONEY("HoneyMoney"),
    CROCO_PAY("CrocoPay"),
    BIT_ZONE("BitZone"),
    ONYX_PAY("OnyxPay"),
    EXTASY_PAY("ExtasyPay"),
    EXTASY_PAY_RECEIPT("ExtasyPay Receipt"),
    EXTASY_PAY_RECEIPT_3("ExtasyPay Receipt 3+"),
    EXTASY_PAY_QR("ExtasyPay QR"),
    PAY_LEE("PayLee"),
    PSP_WARE("PSPWare"),
    PAY_CROWN("PayCrown"),
    PAYSCROW("Payscrow"),
    PAYSCROW_HIGH_CHECK("Payscrow High Check"),
    PAYSCROW_WHITE_TRIANGLE("Payscrow WT"),
    PAYSCROW_SIM("Payscrow SIM"),
    LUCKY_PAY("LuckyPay"),
    YA_PAY("YaPay"),
    DAO_PAYMENTS("DaoPayments"),
    GEO_TRANSFER("GeoTransfer"),
    ROSTRAST("Rostrast"),
    FOX_PAYS("FoxPays"),
    STORM_TRADE("StormTrade"),
    STORM_TRADE_13("StormTrade 13"),
    SETTLE_X("SettleX"),
    SETTLE_X_15("SettleX 15"),
    PLATA_PAYMENT("Plata Payment"),
    PLATA_18("Plata 18"),
    PAY_LEE_QR("PayLee QR"),
    NEURAL_PAY("NeuralPay"),
    STUDIO("Studio"),
    STUDIO_SIM("Studio sim"),
    YOLO("Yolo"),
    YOLO_SIM("Yolo sim"),
    NOROS("Noros"),
    NOROS_HIGH_CHECK("Noros High Check"),
    FIAT_CUT("FiatCut"),
    VIATRUM("Viatrum"),
    CASH_OUT("Cash Out"),
    PW_PAY("PWPay"),
    GOAT_X("GOATX"),
    GOAT_X_SIM("GOATX Sim"),
    LOTRIEN("Lotrien")
    ;

    private final String displayName;
}
