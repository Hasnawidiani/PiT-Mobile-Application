package com.example.wikeenlogin2.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.wikeenlogin2.R;
import com.example.wikeenlogin2.adapter.ArtikelKontenAdapter;
import com.example.wikeenlogin2.model.Kontent;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ArtikelFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ArtikelFragment extends Fragment {

    private boolean isDataLoaded = false;
    List<Kontent> kontentList = new ArrayList<>();

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public ArtikelFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ArtikelFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static ArtikelFragment newInstance(String param1, String param2) {
        ArtikelFragment fragment = new ArtikelFragment();
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
//        return inflater.inflate(R.layout.fragment_artikel, container, false);

        View view = inflater.inflate(R.layout.fragment_artikel, container, false);
        RecyclerView recyclerView = view.findViewById(R.id.rv_kontenArtikel);


        if (!isDataLoaded) {
            dataDumy();
            isDataLoaded = true; // Setelah dipanggil, tandai bahwa data sudah dimuat
        }

        ArtikelKontenAdapter adapter = new ArtikelKontenAdapter(getContext(), kontentList);
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
    }

}