function disImg(samp,i)
index = 1;
temp = samp(i, :);
for i=1:28
    for j=1:28
        img(i,j) = temp(index);
        index = index + 1;
    end
end
image(img);