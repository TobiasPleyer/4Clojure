;; Map Construction - http://www.4clojure.com/problem/61
(fn map-cons [ks vs]
  (let [kvs (map vector ks vs)
        assoc-curry (fn [m [k v]]
                      (assoc m k v))]
    (reduce assoc-curry {} kvs)))
