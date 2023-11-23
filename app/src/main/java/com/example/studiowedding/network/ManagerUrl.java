package com.example.studiowedding.network;

public class ManagerUrl {
    public static final String BASE_URL = "http://192.168.0.104:3000/api/";

    // Contract
    public  static  final String CONTRACTS="contracts";
    public  static  final String CONTRACTS_ID="contract/{idHopDong}";
    public  static  final String CONTRACTS_PAYMENT="contracts/payment";
    public  static  final String CONTRACTS_PROGESS="contracts/progess";
    public  static  final String CONTRACTS_INCURRENT="contracts/incurrent";
    public  static  final String ADD_CONTRACT="contract/add";
    public  static  final String CONTRACT_UPDATE="contract/update/{idHopDong}";
    public  static  final String CONTRACT_DELETE="contract/delete/{idHopDong}";
    public  static  final String INCURRENT="incurrent";
    public  static  final String INCURRENT_ADD="incurrent/add";
    public  static  final String INCURRENT_DELETE="incurrent/delete/{idPhatSinh}";
    public  static  final String CONTRACT_CLIENTS="contracts/clients";
    public  static  final String CONTRACT_DETAIL_CONTRACT="contracts/detail-contract/{idHDTamThoi}";




    // Detail Contract
    public static final String CONTRACT_DETAILS_URL = "contract-details";
    public static final String INSERT_CONTRACT_DETAIL_PRODUCT = "contract-details/with-product";
    public static final String INSERT_CONTRACT_DETAIL_SERVICE = "contract-details/with-service";
    public static final String UPDATE_CONTRACT_DETAIL_PRODUCT = "contract-details/{contractDetailID}/with-product";
    public static final String UPDATE_CONTRACT_DETAIL_SERVICE = "contract-details/{contractDetailID}/with-service";
    public static final String CONTRACT_DETAIL_SERVICES = "contract-details-services";
    public static final String CONTRACT_DETAIL_PRODUCTS = "contract-details-products";
    public static final String DELETE_CONTRACT_DETAIL_BY_CONTRACT_DETAIL_ID = "contract-details/{contractDetailID}/single";

}
