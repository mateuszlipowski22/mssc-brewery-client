package guru.springframework.msscbeerclient.web.config;


//@Component
//public class NIORestTemplateCustomizer implements RestTemplateCustomizer {
//
//    public ClientHttpRequestFactory clientHttpRequestFactory() throws IOReactorException {
//        final DefaultConnectingIOReactor ioreactor = new DefaultConnectingIOReactor(IOReactorConfig.custom().
//                setConnectTimeout(3000).
//                setIoThreadCount(4).
//                setSoTimeout(3000).
//                build());
//
//        final PoolingNHttpClientConnectionManager connectionManager = new PoolingNHttpClientConnectionManager(ioreactor);
//        connectionManager.setDefaultMaxPerRoute(100);
//        connectionManager.setMaxTotal(1000);
//
//        CloseableHttpAsyncClient httpAsyncClient = HttpAsyncClients.custom()
//                .setConnectionManager(connectionManager)
//                .build();
//
//        return new HttpComponentsAsyncClientHttpRequestFactory(httpAsyncClient);
//
//    }
//
//    @Override
//    public void customize(RestTemplate restTemplate) {
//        try {
//            restTemplate.setRequestFactory(clientHttpRequestFactory());
//        } catch (IOReactorException e) {
//            e.printStackTrace();
//        }
//    }
//}