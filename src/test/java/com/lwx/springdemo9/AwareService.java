package com.lwx.springdemo9;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;

import java.io.IOException;


/**
 * Created by Administrator on 2017/3/10.
 */
@Service
public class AwareService implements BeanNameAware,ResourceLoaderAware {

    private String beanName;
    private ResourceLoader loader;

    @Override
    public void setResourceLoader(ResourceLoader resourceLoader) {
        this.loader = resourceLoader;
    }

    @Override
    public void setBeanName(String beanName) {
        this.beanName = beanName;
    }

    public void outputResult(){
        System.out.println("Bean的名称为："+beanName);

        Resource resource = loader.getResource("classpath:com/lwx/springdemo9/test.txt");
        try {
//            System.out.println(loader.getResource("/").getFile().getPath().toString());
            System.out.println("ResourceLoader加载的文件内容为："+ IOUtils.toString(resource.getInputStream()));
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
