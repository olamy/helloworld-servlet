FROM ${jetty.test.image}

ENV JETTY_BASE ${jetty.base}
ENV JETTY_HOME ${jetty.home}

ADD ${project.build.finalName}.war ${jetty.base}/webapps/

ADD ${project.build.finalName}.war ${jetty.base}/webapps/root.war
     # && cd ${jetty.base}/webapps/ \
     # && mkdir root \
     # && mv root.war ${jetty.base}/webapps/root/ \
     # && cd ${jetty.base}/webapps/root \
     # && unzip ${jetty.base}/webapps/root/root.war
#RUN chown -R jetty:jetty ${jetty.base}