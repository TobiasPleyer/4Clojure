;; Drop Every Nth Item - http://www.4clojure.com/problem/41
(fn drop-every-nth [s n]
  (let [butlast' (fn [s]
                   (if (= n (count s))
                     (butlast s)
                     s))]
    (apply concat (map butlast' (partition n n [] s)))))