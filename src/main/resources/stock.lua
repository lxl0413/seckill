if (redis.call("exist"),KEYS[1]==1) then
    local stock = tonumber(redis.call("get",KEYS[1]));
    if(stock>0) then
        redis.call("incryby",KEYS[1],-1);
        return stock;
    end;
    return -1;
end;

-- 这个脚本似乎有问题！！！！！！！