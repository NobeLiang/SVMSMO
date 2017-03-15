function train_svm(samples, labels, c , g)
%====================================
%
%====================================
    counter = 1;
    for i=0:9
        for j=i+1:9
            counter
            t1 = select_one_type(train_samples, train_labels, i);
            t2 = select_one_type(train_samples, train_labels, j);
            [samples, labels] = converge(t1, t2);
            svm = svmtrain(samples, labels, 'kernel_function','rbf','rbf_sigma',g,'boxconstrain',c);
            filename = ['svm', num2str(counter)];
            save(filename, 'svm');
            counter = counter + 1;
        end
    end
end