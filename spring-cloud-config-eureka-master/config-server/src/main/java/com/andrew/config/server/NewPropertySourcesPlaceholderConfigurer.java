package com.andrew.config.server;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.springframework.boot.env.OriginTrackedMapPropertySource;
import org.springframework.boot.env.PropertiesPropertySourceLoader;
import org.springframework.boot.env.PropertySourceLoader;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.PropertySource;
import org.springframework.core.io.Resource;

/**
 * 
 * @author fansq
 * 解决springcloud config中文乱码问题
 *
 */
@Configuration
public class NewPropertySourcesPlaceholderConfigurer implements PropertySourceLoader {

	//private static final Logger logger = LoggerFactory.getLogger(MyPropertiesHandler.class);

    @Override
    public String[] getFileExtensions() {
        return new String[]{"properties", "xml"};
    }

	@Override
	public List<PropertySource<?>> load(String name, Resource resource) throws IOException {
		Map<String, ?> properties = loadProperties(resource);
		if (properties.isEmpty()) {
			return Collections.emptyList();
		}
		return Collections
				.singletonList(new OriginTrackedMapPropertySource(name, properties));
	}
	private Map<String, ?> loadProperties(Resource resource) {
		Properties properties = new Properties();
		InputStream inputStream = null;
		try {
			inputStream = resource.getInputStream();
			properties.load(new InputStreamReader(inputStream, StandardCharsets.UTF_8));
			inputStream.close();
		} catch (IOException e) {
			//logger.error("load inputstream failure...", e);
			e.printStackTrace();
		} finally {
			if (inputStream != null) {
				try {
					inputStream.close();
				} catch (IOException e) {
					//logger.error("close IO failure ....", e);
					e.printStackTrace();
				}
			}
		}
		return (Map) properties;
	}
}
