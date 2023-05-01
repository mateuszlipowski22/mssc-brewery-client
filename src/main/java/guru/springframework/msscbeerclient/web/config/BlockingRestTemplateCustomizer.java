package guru.springframework.msscbeerclient.web.config;


//@Component
//public class BlockingRestTemplateCustomizer implements RestTemplateCustomizer {
//
//    public ClientHttpRequestFactory ClientHttpRequestFactory(){
//        PoolingHttpClientConnectionManager connectionManager = new PoolingHttpClientConnectionManager();
//        connectionManager.setMaxTotal(100);
//        connectionManager.setDefaultMaxPerRoute(20);
//
//        RequestConfig requestConfig = RequestConfig
//                .custom()
//                .setConnectionRequestTimeout(3000)
//                .setSocketTimeout(3000)
//                .build();
//
//        CloseableHttpClient httpClient = HttpClients
//                .custom()
//                .setConnectionManager(connectionManager)
//                .setKeepAliveStrategy(new DefaultConnectionKeepAliveStrategy())
//                .setDefaultRequestConfig(requestConfig)
//                .build();
//
//        return new HttpComponentsClientHttpRequestFactory(httpClient);
//    }
//
//    @Override
//    public void customize(RestTemplate restTemplate) {
//        restTemplate.setRequestFactory(this.ClientHttpRequestFactory());
//    }
//}
