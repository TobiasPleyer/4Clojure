;; The Balance of N - http://www.4clojure.com/problem/115
(fn [n]
  (let [digits (fn [n]
                 (map (comp
                        #(- % 48)
                        int)
                      (seq (str n))))
        ds (digits n)
        cnt (count ds)
        [left right] (if (even? cnt)
                       [(take (/ cnt 2) ds) (drop (/ cnt 2) ds)]
                       [(take (/ (dec cnt) 2) ds) (drop (inc (/ (dec cnt) 2)) ds)])]
    (= (apply + left) (apply + right))))
