# fansq FastDFs

###Docker 安装 FastDFS###

docker pull morunchang/fastdfs
docker pull nginx
docker run -d --name tracker --net=host morunchang/fastdfs sh tracker.sh
docker run -d --name storage --net=host -e TRACKER_IP=ip:port -e 
GROUP_NAME=组名称 morunchang/fastdfs sh storage.sh

docker restart storage 重启容器

### 配置Nginx

docker exec -it storage  /bin/bash  storage可以是容器的id 也可以是容器的名称
cd /etc/nginx/conf
vim nginx.conf
修改路由匹配规则
location ~ /组名称/M00{
   .......
}

ps -ef|grep nginx 查看Nginx是否启动

./nginx  /*启动ngixn*/
./nginx -s quit  /*此方式停止步骤是待nginx进程处理任务完毕进行停止*/
./nginx -s stop  /*此方式相当于先查出nginx进程id再使用kill命令强制杀掉进程*/

./nginx -s reload            # 重新载入配置文件
./nginx -s reopen            # 重启 Nginx

exit 退出容器