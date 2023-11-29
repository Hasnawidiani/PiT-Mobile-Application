package com.example.wikeenlogin2.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bumptech.glide.Glide;
import com.example.wikeenlogin2.R;
import com.example.wikeenlogin2.adapter.VideoKontenAdapter;
import com.example.wikeenlogin2.model.Kontent;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link VideoFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class VideoFragment extends Fragment {

    private boolean isDataLoaded = false;
    List<Kontent> kontentList = new ArrayList<>();

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public VideoFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment VideoFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static VideoFragment newInstance(String param1, String param2) {
        VideoFragment fragment = new VideoFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_video, container, false);

        View view = inflater.inflate(R.layout.fragment_video, container, false);
        RecyclerView recyclerView = view.findViewById(R.id.rv_kontenVideo);


        if (!isDataLoaded) {
            dataDumy();
            isDataLoaded = true; // Setelah dipanggil, tandai bahwa data sudah dimuat
        }

        VideoKontenAdapter adapter = new VideoKontenAdapter(this.getContext(), kontentList);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new GridLayoutManager(getContext(), 2));
        recyclerView.setAdapter(adapter);
        recyclerView.setNestedScrollingEnabled(true);

        return view;


    }

    private void dataDumy(){

        kontentList.add(
                new Kontent(
                        "Food Garden Wujudkan Kemandirian Pangan Keluarga",
                        "https://drive.google.com/uc?id=1yLdVx1NnRkbkKc8o5nZFXwTAkJgCFMqi",
                        "https://lh3.googleusercontent.com/fife/AK0iWDxXkFV3Mw2H_rGrkrV-YpGbFbZQhk5LxL7KpADpNyhlGqXXD4p9nRL4prPgizpHnSanM8vDQYC5z-6CN40yJcwjHCCmO5KVxkU-4-cERcl4SjVUKLdtEIs2ZFuaRNtsR4hpvFYEsxZo80aWe6FY0A2cw4ZEVwv29NWmWjN_qqF_VHLMYxW6qQTXC2KXjkASeOxtYaw9q2jXeLj75cPCECn72NTvlY53zQuX_HndiF_-qOKPPaGUyjDsGig7r9b529jnyOeCSkzOa5nfcbFbw_rdcbgvBeLOEW5lxFT_cffjWMBvCEvlAIbyNKDXlG7bQgFYzwBowlWH5rn4RhXK8gPHfVo_NkzOvneUoZer1_gICQdr6H2mldjktjnFqslNugGZYjH3FInLOMuWWWGZnIjt8YiGL_3JO6wyXDPl_KsSRe2kuCzWFg0f64GtJ1_aJ0_wlcUNU30xkqfG9WcOvujLi2-pnRQVBpy2jLXoVwZaEujO_vTR3vCt5o_D3cE3XJOtgji0ZQk7EupQ7Q3U4ZDdXTPsmhrkQIWkuBtbLvbtMTDboO0pFI8peyHyFTYLbV5D4VULzta1dOZa0XyUwN3z2lRT0Syk5A3I0d3OyMdHATsQNUUh5FXZrxdHBLfXy-mCYL27Rf5xVShkVjfWVMD5qRQtGVBjuMS7vs1q4mYMrLxucRqCP6bZ6EWRMlA6hi-IT0tGMsQeyOxdni_RrV_EUP7lPfbRjQ3aPuOGkb70OGfx4o4kmXV_zhJiHSy_lRxXnaLxHPRT5_uJkDRj9YSFImsCj3K5wp-GJJTeDsuYe3dcGk0zvm9yudXe6KQgAQJXJ1hoM4mhpQPXCDBlsC4RPpBPuXPY4rawXWRFBl98eZtoLeLkmjzEvCJi2fCrhx4YkjXRbW3YYDHWFNP_mftkmivk8rhGmQORPd-Wn4lGbVQumcitjFT_63tPTpITQaTlMIs5yCBN5m8kEc3GahAYpdWySKJn6cerNJPeZ7gzea70a6I-kBMY_lXRP6ifvz18LMTa-buYfgFoEzO0KhvuoaoTQ2yJaMxV6rAHBOAzSVoPBYKNL-OKI7fVrb2-kaRy8TX-aH-kSR93DeSGR1mUJNS2eAlYucpWXPAi1GhETstGHm01GSBMkx80xMEmFgkyrVuGFh2TQTtmQzzJxK2GTqwMunMC6pd4NUsT6ncUAkjkRv7mxdm07U4XkP5TehMqursJkKG2PsgUKH-H5bzyyT3gmThd5zpAiaOSlcyxYMo4DO8pbBuRS_RZ0SHbpyp96nlr7neR29_HuFxHAVlenO7a_LA_oXbWNVcICUCd5bDLdzXWCo3mjtMhKEnYowuiJunclEuu08l5ZqN_pEgFyzgrW6KruEHFdvL1tDSz8zvqEJNcifeWFqDX2P1wkG-0duyqo_bZAJzioL-xApI-ZLh6q4HkHBAtr0J1-9kXZDdmyCs7pRQ3Q6zcWy24HXiMYcFNbDKG_1sJViNHYs7tnHhG8Y4e_CNUO_CpKqayipQ06gqa0Y4_v9I6VCRnafokRxfVh0kY7b7LjCmvxkS26IbonAfXI14sACMrna6wF6XymSXDf_DO5m-gkeEr=s320-w320-h200-p-k",
                        true)
        );

        kontentList.add(
                new Kontent(
                        "CNN Indonesia Living   Rumah Berkonsep 'Urban Farming'",
                        "https://drive.google.com/uc?id=1kY7OqNqRrxIMBvYvCZj_SJEUi1a0Dcxo",
                        "https://lh3.googleusercontent.com/fife/AK0iWDwVohEAfddu7bInw9Hdq0nG3ratl2sUXD3oLuc-VaQZd0Ofl8S1KUAyZaCcDC0t4AiC-KEFjeJpYkBwWgRC5u_Me_JWykWpZWCE7SzkbpTrqzvzzGOTCUeevWWS9TZjXCUEVS6t-ly-cKosLIvmnFH5XAzEjk7K_G_bOpet39CuQEnZYl88wxGWGTuaAL3jynuNg9oQpoCrlXqz0QLsdgCD99B8tDHqEuUs2AKVPHtscl3WSpMGkO_2Kw8hJ-nlefax8n0PKs12zfyWslbevX5xQL4EY1chR2gtKyektMwPElGm822YmH1A9JX_kn_wz5jirylfmfieqVHMk8Mr6GiQp3IhwcDLwj14cHVaMs7H9o6ZGzUFfir8nfcEl_DTBQssOzR-EYOQvAcGAAJsaF2epXSyDjLkaRX4VOshY3kpXeUI-GfUPoyn-0VNkEdYmRkiV0-Kd9z1YHE6O5ceTjUUiFUIGVop2gmhupUwQx4ROdaoP58ESN2AdQXRkrqI5qm9fuz2hy4YEWVVSJVDqPrzpulRmI5QgyLPjjKwEWZGiOEi_RVCwcWUeXtWozHe8Mri706oEFcu_9saiKW3t3xFVdymgMthzAx7afoxEV2ifknvDqMQ_1aMPydlbs0vb_SSVkShMbui9_XE65GXc4_TmXZbwuyblQ20Kb9MA87iYhpK651L03_qOSzelDAUWEgLdImfOzYKDcgJaMNiJ-rhP0MwEsprMJqjHtBDSpq_QPuE8DW0y69YMTdxD41xm4AHkEMi3juX3PiPiZlpDCeb1IhC1sI_U7P65zrEdmLoAyBiOe7tmNjmUl8OH8yyNu4m18YExPJcA5CPAvgEZq2g2pwZq-zMkmbLz8b4HC6bEUfd_Fc2vJ87hwVwoW-lZx4OHLyQpKiBPwyjzQKS8PMez_nWAE5VIpu1zr6bFISRdHendLRmQVvN_aGNOFcxvIKmUAiXrhPG1qOa9S5bYBBVd042KJ3vXFjh5xLhx3VlwCjV0AB1Fkh3IlFbTfF43GQZI45vX7xmmbl0TkvwRypeVGAB_dKdVAP4fl1TgGkEE4q57XlcUaWwZWlrYVJnGjPSVpKlARix2Us2EBJ3TGzW1RUe97vjfGM4PxhtdZKrzpEmdGWQyrLdq06SBF24m-WHO5ig8EnSlLJUx629gKweu1EO_7SbZ0ecw_xwOej6QNXt_ToBmRiGE26HZno1vRh3AeCQlVOQxzInWS0iNb1IxrFw7Xozcbm-FVUWaRyBGSGRqhNh9bcIM5ePifoLdS9rmAqWwygm5mNBfFd85XHG8Rjxjx0WP6HhLWIcQbOgx_0Leo71i2FNAURjPQ--NnV5EH5pEiKbaJB7O_Ol_11uzt9Sk-ci47weZ9Izy6XFyVPMBOxvo1ddCQOpw0oHa0voy61zIovNLMpkBtX1mRcYacnzS-VP9YEoJh0CEwo6PxzsqGplYGX7VF2BhmAvXs23YwKbYlc2jOGNrTvswdIGLmZxZgr58jR--J-dbDgkyrbU0KSaFya1QgEN-zsA__1oGGCJsavn8W7Wm34zew3lS-nHMRoJX-cZWwwnrk7ApK4SC-rJSbxJqjyLhReC=s320-w320-h200-p-k",
                        true)
        );

        kontentList.add(
                new Kontent(
                        "Cerita Urban Farming di Gang Hijau Cemara",
                        "https://drive.google.com/uc?id=1a7NUAT-fmz0CUJWpZupUr6B2sS0caf7Z",
                        "https://lh3.googleusercontent.com/fife/AK0iWDwK_nZrymdjCpsanavY3UofioAXTEfmP1aBGmbsOxJh6L9Iq6PKcy15QFbAAhjXUL97U7OmqMMyIqDWsmcVnmmXXrj0xnl8HeOoyatPNkxOK3SwsOmPfxWDpsI6f0uUEzEdDEjzmfo4VeuwnFgxICt7dql3gSr-yI-nyA0UtPSZwYREA0nc6wX2B0F9EPLM4xp9FxvRBjft_ZJSQEDBHdCMEi_ahY3RUb4MgT6L9vx1w0lsIKLgxWNQM8ugTWkzb3_eTGaiSGZpd7nRiKebZLJBPzHsGzKw7O4Bva1ALBJRNqIoPRn0ICbHFRXi-Qz0t27_3ChfqtICoKzkM_SeZJnrkbIHa2XjTr0UJJzhagpsVFUXrBi_DyRsvmFvZklnW6QrNlMA3rzaTn9K5YcXFS3L_3Ryod1tCEmnlO2gP7nE76qBnw9Vt7OBXEgLzy0Bfe7KdbomidWiV4lj4-IMbW8uVERd_UwOzqLvTlNl7Ds3ikMicIh2K54gvudCSzHa27Qsjkb68sdzUQjab-2urDQcwd3JTmS5E7m1F1LbDTBhlkr7sxPug_slfWY2PYHqYaB9cQg44kIGgEyHxCAEouA0kfzi-1glwgCr4m3nQJ0iAEVTV9uOyJBdqehobEJBs9362Tt_an4W3X_gyL8AytYu31H1sx85WWLd3DL15taz9LN0bN9-quOvA-VVEjv5-u-XJ5gSr3bGVeArH-xHI2uPLW8nXnxTFm6kZauBn4sl3F2Z5DI20aviaUh7hkYMWrXAlaT1FHPTLK4g6I-Y5PAPazJ5R6QKQlVRl098FIbayHbJrSiKnRCzg7BrlehRNDceQLq2aUjmCp897kpiM2zdZXvBE0_aFEEsWj5m8fLIEwwzYn-AoOAWv3vCdz-tnFQLMwNRL5FxFfIpQOvY56ATsIgx8DnMUh_B53f3sO2jaSPmi931JQ3Juff6yMcV7lcgbRMQc98O9YlnL8wJi21wKKGNDzlXzBobbAMd7_z2vNLDD8S5voKAPFPX0DMu61q0mOfu-JFKMKxnnz4jqzbrQseiLN4U77iIIQXUjvJSj5a2rXVnooEoQ-sfcg-io_Wbw7zCvAWw6dReTJsVDBkLFkvooMz9If1NNZa9yspK2nROCxUoGKBXaH26VZuv60LA5zX1fOR6nQa3dwYcmcZwNom_mV4kGx6gHAuFZaPUM2N4kW6T-6VWqpmcn3ptYg3VmzWLswHBUd1G0f9rsfDlpkV-2jzpI3hd7laaLHJalx4L0K2qVqjqpXj0vz96CD4p75ORPMH6L92kmjevZkcX4BajFxxMhtUnrMSYFY4pi8NmZfCvgQH4-_v85UFsO_Cp7a8ateWGPTTaRfuy60b_GrPp0rkO2Hd8jdaOXGhzAymuwxht_Ug4mEWPXG4aUmTyhICfTJwwxjIXkr-qfe9BeI1QEUEUG3gtUuyn6GkbbFP-Tl99mMUH-yJ1cOzixJMPj9Ek_IY83zPtouIjbZLmK1fILCTN2N56N1VXNt3uTwtfxlbErWnzuhB24dQhFbDNm9MiQP1sp6rG3VKtiJk4ugl-6ktZKtDtjqT75wjgEtE-ke27a_q4RTP_aZaQ=s320-w320-h200-p-k",
                        true)
        );

        kontentList.add(
                new Kontent(
                        "Urban Farming Solusi Menjaga Ketahanan Pangan",
                        "https://drive.google.com/uc?id=1_zChmx5rHwzJimJIRwiqkm_d2EdmGnpd",
                        "https://lh3.googleusercontent.com/fife/AK0iWDywlMW6BPdfb9OBLdNdxdJY1rS0oAc3aCfD2m5maMNLld09HrUPn7kOudJJMdm9JqVZZcaZL9VEo0NTo1GdHXs2kp-Ckzs4eiIpJoSxbuho8SwJl0hUd1oZPOJJtehIrWdhKCH-7p0vwOQVJyJtZ-OKETvtzrn1z27qKp0adQRckv1oSr-ge37PVbMPkjJ2Fjgeg3DhaWwLWMqJclmo1G0pJdoC7Fevcjj-CgFJiEUspjCM2GWPpyGc1GC_Ph49JPHEF5ZHXIU-v1z2ihAcrkuT5bgfCdbpA-305ylQddhC83jEHIjxtPgh-VJKYhHnxoG6l5OouOBV9Lk9EQQDv-4fmEzAF4gu4ukY5dzyH6jco0_XIh_8eFIywfd6Dm4FhbCowR2WWpPwej4YrnZC3zXPlPlb40sQJj6SCrheyHKW2kKbF_9n2-oEvGlh25v-sI-Qh1GWuo61TE_Wn6fRAT4kf4SYS_n7hPmXdHMdFhpcQvL2-WdbTLRDBCdAt2S2e6qiYCTKv1hdnPdZ3illv7wrDjKD9iY6m9vli8Md62nt3CQa7wJDUfSeF4HrwAFc_t9UnYKnwFMKla9q5oXw5n9dkcveGAQ3F4166kiSrJtZyOHME_sLcxqbXRyPCc7QHWIctqkJt4IGoTWXn9CT7tIZXCoYbp28VoU_VmL1O_8MeFuHARnzPM2UJUoJcIDS5whlS3Zc1YyVJy9Ttb0_x3eqm-awt3qJHGePhHm-15gDp4S6QL4XBu7I2MbliFNKGfwYAUbr11_yiwuIn3mxz01efZsdOLWLyjyPZmHvvjZEXFB8ZPyPuQ7IV3eSSUzxRIQUy5O-pl7HmhR0L2wB7FtoLi3q88k1MKB9K9vyEaG6_f8bHiQk57DLMhwKyFkQr_mwzBSsJd2Eefo5jVCYuJIGhtvrfXsE8ldiZuaEAkAEgLDvCovqkRq6j1u8LGLka2gliNblwNeQ0kJhINTCVE7_NEXCEClp3APCqY9B2R5BUbvY1xLEge8qwhizwoCNUqnnHoWVdUrb9CaS8cw4VqhmEcgj8WxL3CyIvMfjSInq7UzHcHGBh0OKnRWZrLdjIYV0N_C9Ho6qzerUYBB_f3-rFxUO1P04yQ4TuhCVyyUF56FvCIafLZM8UVXjNsRe4sRUHTAM_SbFYwkiYuUtOeiYNK6Ju3TiZBL-6EEfHT7P2QeDm9QOR78ZYSepC14IxwX6y-8OjCWF-bfXDRWM_YYmHtkdDNegYjd_DCL90cLGen2D6UJ4_v7FuG2Y1_HvjNybBC_HiV1tCFPg6u14N0wjlmpDGKNRtD6aDupUQx7poihyEmdi2HP0wg7_qe5IC-VPDY48_rHHUIRuS6P40XEaIJoa-R3gVzgCzEu8Rbqm-cW3Sj693sryf8Jo34-UcNFQkqo73kGB6ph1m6NIrjIkygJlZWbwb2EitL9YqAODfoIFyIZB8OtSqiMx6tX0DuIWZshTB9Nmu779kuXEnXveiWKEprgL9DNiI85XcSGrAzkHJIuDFBAerisNvAMFfntMfcn6R1wIslziCq1PJSlBOWmvw4zz5t-bpCB-Rmvi2Tb1mZRvF1VgBdzUDfbx=s320-w320-h200-p-k",
                        true)
        );

        kontentList.add(
                new Kontent(
                        "Potret Kegiatan Urban Farming Warga Buleleng, Bali",
                        "https://drive.google.com/uc?id=1_xJuIaH8AzcpRf7njSpdNJX2mFttiLwM",
                        "https://lh3.googleusercontent.com/fife/AK0iWDyhXYdUbbEPnh9S_U1up0g3270MuRIxyYXfzMGuIZ7A1M1iExKVzcw112O4vSioe-tmcldXZgM7lf5I3EZsOwKMHPRUyuo5zoWpdayApPp53Y9L21w-_euDnSfyAkwBLZn_Hc9IeligS6Uxvonc1vOlBHtLkozWdjDEVKsppQaovvh6OriMiMW5Y0VH2iRebbeim229OvFtNJbpIKEQFcAFi-2LCFmcGL6g-Qu8wdtZyoMEhk4qd4cbtP2Rd_NEakKmfR9qtIy32G7EFs_cyv7L1nUXGQhr1k6WHuSpxt28X5IxfUQeKcd1w7RPPYYe5J1OOyooaJXAs0DHe0lYlynUGtGygzmHwjs6kTROJ3o-gL22bhLGoz-T60VOX8hv1ua1E7nmveIZyBIYESm_BYhWo3RPm0ADRPRY7s-XLNKYOXRtXNzKETiFNTnIsn1lZZd3izD9OMHAcnyMAL5ebfsy5LJF8nhvKxAOD4w5_vmabX13WfOyqjRT7nppm3JWZ0PG0JJ6pqpvv8UIdHkPDh-9uADzZjtCuWxsDLRyqAYs3RGqgHEoGD6ppc_C_4oJrtMifm3xxdnkopMq7gEjkgiGZSpy5BWXYQYC-CNtRR78l9OkJQ0rG4_dO4aao_5yQ64iJA0l-iqjg1FUq-0OAhO0w6hRCI5yk_eubJ6r2MoCF-Bs2Cn50bjlpkuBE2sj4DWAlt-yR8bubTM0pfksPrMT9qpsySjNZHNaHhuWxiKOvtK4h8y06CCHq4IE5tFJSaSrClF2AF6RczNoUqtuC-mmdtC4IYN0COrSLNLoy_RwqGMyheln5INOplDxYJvjuyR3_y2p1oTFxNm8lqNDzAbQNBpzR9sugYtbP3E2VM_yDXgyAwi8KVRQtI9l_FPfcl4QusDd4s4aSEMUFn_N3t7JSabmwob7I-5HikcRPHa5y_F-z0CwY9xcF89UB51yT2uPcWFpSMk-LJ-C_imcn3VUnkzPrltMaLWuSC9BagwEvENvrQ6h6d6V7ssxnhMthrlt8GlrrE5QBkpaF0nB-2l1EPJGn8NQgedhgolI27-AHReZd5ykNk1bp6Plp9JiQ5-QNmLFsNY1OwKp08X145tgD8GKIf8-418oNzU4FbV_UrYuWSj2Img-bZgOs4hUUON5l-iHKhgxluMZItXtT5iuEzTydzr9AMFa288Fu-O3zeZNu_LCM6EI1nOXV1f5xq81TKtlr03QWycC7iNUcYPdWS6bcKfUtHUlZSJq690jk2PN79NdErXH22xvXRLLVyZKadXrjLS65JkArJrA8TNiT2ltxXlupBVbUfQf7N_B20KAUX28SXgteyawH4lgu-zkld2c6sAc-ktheV7fkCL9GN1c_muTaodu8pVXhymhe8iaFc4h-5D4wE4LBObL5QfFlFrPBOmhdtxMlwGjsOcFCIvAiyAn38MwKaAi2OAC5hpDJ3_jyt_mzglNiTkhY_3taaqjLHcYnYBhBh5Tfcgbf_KpeSwRuCb6dE85pbWgPeYeLfvO1LggcicFDx2BSBvbIelVdlVtTIjQkofKZTPJG1iYpUwuWxGX-mfUZDL1NhjLXwACXW7LVDKGf0j9=s320-w320-h200-p-k",
                        true)
        );

        kontentList.add(
                new Kontent(
                        "Food Garden Wujudkan Kemandirian Pangan Keluarga",
                        "https://drive.google.com/uc?id=1_wW1lmNvbxOMHXtoi4SGVRrAZZ7_U3Wg",
                        "https://lh3.googleusercontent.com/fife/AK0iWDz5SutU6ZayX-exMjgBC1PRB07ix3ioFOQz4m9n52AeqDHdJfxeAwAfSLDgslzaCx_f0Ny9MA39yvwEfZ-y73IZmPPlSRtWm_FGg66LCKZIntt9OkZdzNzZ4xXV3AwbXzCIeJq26n64G1x6zv9hD6lpEMVkxPs3GkCs-hGP2IJXUN0L3-l6m2LUK7nXASd0Jo2eERAO4l_L62Yn159dl4NfnU1v5f_ecln8JJtuOXGcuOGf4gZhoYmU60EcesxhhN2FqXno_g_-KjlKgsIap9T3RoDDWMqcfeNM1iCrGnoSomvlLkOe2z6unKMl70Hq7xOApHZIkRXkIWjZVpsPsx4t0x8WyDnXuavcNae4gs0gxjCQmrTJmcPRDvpmpC1Ud1Jf5X4fGO6sk96CDPF4ZzSIi7ICTBZqqfkEoJI3O7x8Oy2OLzF1YTE0s00ZssD3Q5wwBK3bfj_ubSRi7QEA3xWWtE50JEj8gUbGNpuURnOst_m9APlFClfA1BxXhsilDMFAvE_vJokm1VlukdO2WZiIx25OZ0f4rijFWUlDaAusxcht6qugZ8RncpLi7DFxPoLmErKt1Wfpj4s0dWeB49Xd7DAATAUC_FNdDpp08Uj3fMCDw5G891mDH1p7ECNL2vetm43G8-gKvlX5qOdqH05JIrwI9pdsBtjVFhaWONM8CVlEcgH_KJxLzU91XdyqnG1tqZ6NtMIE8FiXNj2YHqUO_Yee7amkX89GuO7BZcqSPEtSEca81_5ifWQTK_AV2tiQ0IU12bX7LvjbLonOXi_yUUMKwpECiyar8cDB4DrEfhJO1PqUDnsM6_4qAMve0f1lYOtZe9BN96gUdcMAi8A5vrWktEztNNoqxX8mTqSIv-PPZrdbuge1MD9aQCjUTPWU9HItdZiIOijh5fVZmBMxDS-hfOe8hXVtK2UNReFjcNDzbRrnlDhD5_FGbUq4B5137a2K86OPpknz_TagdNNfB9GwzdkxvMH9x6zoxbG1u2Hn1BVPD3MEYjXlsq9byFHRAnw_ViX-hYNqMersMBqmWFyI2cq5-2WGe_96g4oh6ds-_4yyM1AsCeYEDOpGSwnt7f8ASE9IJUQZyLt6OXycbup9h4uOuU2_cnVV1joEMFYncvBb1iW53My1EIdXzEON8Hw8q3xUtH74bwZwMR3xuk-dIA9y0l0Jcjtq4OL5p23byM6fAc4gDJJ7EMynaLcBrgRu8wIsvr-3AF3Odi6VnTuJua1g7D5mcQUFUu9eXyA8etxaBdQH8SBZKV9aQhVPkHsKmatLJkRRnXj3VTd5PuCmIcAZdD6NAesTfvyyJs4noFBF4kF-qrCGp-2FnXNp7xqW6IDhMj2-QSASMLOfR448kcjUA6PRCUnL4yxOsuyGUo3jiLNyBopiqk_6thNNhkXw2Cqg8X5YB-u0wNiwQIMz0nxT_5kW2ZUVds01O5-OmbSkGvid4Dzatw2YqdPvaVtasp58Da2MFy9EG5XIBlhHkKciWkGW_08XysqqU7ChsO-xM03-lrPe9z1TlyJX4Dq86YGbTzODVgGtm4iBiztW11valt9BgWSi8dS8PBLuuG1tUSb1EIKo4jCi=s320-w320-h200-p-k",
                        true)
        );

        kontentList.add(
                new Kontent(
                        "Belajar Urban Farming",
                        "https://drive.google.com/uc?id=1R1M1QHUugVgU2d2-9MYzoRGXVuui-0Vu",
                        "https://lh3.googleusercontent.com/fife/AK0iWDxYIk6VlBD8yTjSK7GGf7RQdKVU-aWNIx0-fVoXxlN2Myp8R9ribykKDD-iJ9g4KcNTSz2ORSXa0tkjqyCtRqGf6m5Tg_PdPHEQ_X6ORBrfKha8KjfQ1heTNDsGI-7jXz2LLo_Cnh_kXPQEYIvhvjkmDPsNbUv8lV4XIs7aBf3MyE45ZZPPWOc5YNK2JAuo_WiElgrhF5H18NXNj3Rrfrwgrl5oSTj_ONN_KZPkVLpM0lST5LrcRif6AeLiCE8bfgn1W-oo_VpEigxF7HXA6hBxBrty9i2y90AW0XFQYV8a9yPUSHjCKO2uG3SG_2n7jBIl7I9Ly2BDmETST1uaMWJHB5tNfIoka_bemdUm-P1CMeSnZi6Oln9ecygdCk_bKztE_Ei045JwlhsHrHBFugRN03Dt4KhukM24hw22nKPyAKztGqVuj67M4PGl-thMWGQdDbqlTFs2sr1rFcQZkXza2bBoKziX5R0y_ro6scfq38iSVqsDD_pdVZrnCCIO3q9Pa_jxPqXqSFqflQXKLdV5Plh3Kb1AJdghX2fehRiFUXJlIrT05H_vHjS7d4g7oLkso_ioHlbFx4CCdVZLUNNouRP5KO0WPx4v0aEWtmFca5f5xP5snwmgdyBwUQmE6facMKS9fstgraL796JfwwnKu_P3tIB1vBNjNY0mR0NpoOaDj0GeHhXkUA0Hws-DxY2j2-pkbsd9gnpcUCvjO7f3tKF0KlxXkQDUP9gcaPbFmxFKYemfY0DMzocGGF_wr5XNa0SxRmU8sRNXBbMxjToY3-toxt3qFZNTrLLyp62BcSH06efdfHkgkG-48-f2vMxTI3nMpWBXKUOUQDHGeyAQkmnjirsuczR14pW2GpNJBByE9euHmskNM5wNyZ-0xL8S1-mdRiPnoPDfwmTxy7zJkDmngD3m5dlrE3htHvAeJg9NWZZ5b3wkzqUY7HPhoV2VsIcI6IoT8xV29pr9pQ8XqoGKEaS-ftik51H52KWttk8bMIU32Jn5YRS2dxvCfAUPcGyMF3pBPD74pDESaq2HqB_QLQhQ-4WAegqFe3FKat0OyMcWuf8a_Wmv_XKQLq1idkxXekeqUTrFZ5PR3ZbyrFs02XJqJIsDAEDxCakPJaiS0GaRiZPaCCZoaOElrhvcVBbo2E8iwa1D9YwvRw_7NTxi8AZBmC8opqEoc7Lwa1N-jqq9Eeq3TW7EbuOUgS3uIbaZArIDWcUxpFC0pbyfoM4lH2EyoaZw6OyPNgAWO2kK2GiZlPQZp2r3ffHyAvugC5r4YjO4Ln3zNfKzWeyx-zonBfC9APKkNN2x0Z7uZbOmN-U-YZdjXs5M0F5S39_dvnFgZPnntKuOz3rgvCt7_DMUPJEzjmWeVqO4yCx0Ps4_Wzfb1nJJE9Uswq8i5MowmBG3BfWXaV8lEM2qXSFZ92Jeg_-RYeNcFVTuicP9tSPsoMQXjQfE2vuv95YWhwFSdr33EqBg1D28r_XnMQ-nemgiAuVCdbx8_zuGDwX0liim7Xh5bkc4sOD6zUG1QvSNPbKagaRpyCeGdR-jPstW_4FHqH9VsnaxfnJSlfAW8CzeDvvPl8ICPhcVc_yd=s320-w320-h200-p-k",
                        true)
        );

        kontentList.add(
                new Kontent(
                        "Membangun Kebun Urban Farming",
                        "https://drive.google.com/uc?id=1MPVA7LMHS3bM9kXZSuUvi0heGCSQMkb-",
                        "https://lh3.googleusercontent.com/fife/AK0iWDxPvCiJJIAk3-IKX0FSMgR1pJ6bYJLtmLR7Srs5EdwN9v83AmrL6vNaLfwx0qUlj_xG21x5L5Lz4IoqAV97zSvKVUtVQIcQwN7C3rJ6QmnM3rsCtddHFXG0bvMl7-GqaMPEBfIHUMqYKVESDeizFvNPOsecb1S3KCbljrbefU9B1DLsafNijX3ktL7v9tX213q_OWR35l_IvAfdN5C0kCkTj17-2FxOWSCWoQsL-WM-qt23cPa3AOyNUsMglJLfwkW_gQDQkHfzRLBSUzzwGwEoPWKxzLTOwQqA9nUcd6CFHRr27-R0pvMzpDAewcRO8vxXzm80OG3L76ae3f9HILFXEY0DqI8RAZqaZpHTWCH8nBnc39OdkaKmAnovjXw2JMaONcO1V5PkeAEnigvR96xfPiCZ1JJ_x5yX8GiHKU-DxAUcvrdlOU4EvLkb6nfkKOscvd73-1LBZ_v2FVVi19-fNmY9b9s2pt4OoWPUgyGXY58wqqCumSpfZSLxhgtU44chGvFDzfdmdwuGIyAxc71U1UEB45lGBcrJNA6yZ9RsjdbTliiDpLhiAVLmGTruYThFaDeAbq7f8n6OrA9IdjuQZF85KB3Ch5qDCQXGZuEAVzPdBa3M8lzWl5pDgDLayzqxAbc3Jg_xVMIOXE24dvkKrVB3bjjfmPphGpBsCR5_zGMN7uYwLwXM3uqNFwuLLVzcpmRWBClnRsBRaj1Ok3q8WhSAda1J2jehHGolFiXuyu3ZuBIwPf-4GW7p57xYjuWSHZ-8ABgDb2xItCrlnIbpa7d-YRe5Rfps-Hejh8bWvHzBmAnulwuJHo5-bdg87TcSaB30Kbe5lPU761nmgFGcyWCqiSMDXlcvPOo9PQ1XvEYZyOdZmqLPCgMCbG1dYhq0AgiDHhZcly_D0l_tvguBXcmr36fKIsSqWmk8Z1sA2pItHOHyJtbjxIBVrFaVX4jUvZICVIAk0JWtNsEqtXS1y7UU_SjhJoEW2bPh1i5xDU9CvvG_zOYv6IvnsQdopT-ikYWFCkGbhCH1sbt_39RI25gsRVga5_a0krmiL0ncTzIhboTpQqtbOWvrpT_YV75toaKsKVeyj_AU_gHSYhQiGlq7RF5XDF-iUZtnZJ8XIdkIPZdvsvRdxKurT7rra1E1ymlUKaXpaEc921q7l7bO_HsJUyyqHDyLvsXqR1MURaGHG9J6Sg-CEmmQzT2v2NgHT1woYPa687Is-6XB50z2VHElgwAMP_bmaIE4MXOIiyTEPtqoKh1aAe5QpF7DCFjdxOxdxabCe-615FS8sO4PCJxqWsuyINUZOhODQz5OfdZILrLrwjjghigq0paBGTIvA1rMPKEFB8Y353uZbcI1npwBSZyQMTXcbyAUG44rAPLd4EWVDgv3xTwJr-gUg2ZZYdFHfw7jZ9NWpLGRnjgheqtk_JMD1Lsbdc858RbAoRlLuYVeKDZJ0nzmGdG4fPG70FVS0xptvf2f8E3t4PdMDeWUJ29nyruOK1GJK1RuqNFf4MiHClb4MqH1t6C9SKlRVKAeYgOTksbnV36-QXUMJLs9OwIGgqLxZJKChwZnZDKEnbra74Ks3zAFayV9=s320-w320-h200-p-k",
                        true)
        );

    }



}