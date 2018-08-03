;; Merge with a Function - http://www.4clojure.com/problem/69
(fn [f res & ms]
  (let [rf (fn [cm kv]
             (let [[k v2] kv]
               (assoc cm k (if-let [v (get cm k)]
                               (f v v2)
                               v2))))]
  (if-let [m (first ms)]
    (recur f (reduce rf res m) (rest ms))
    res)))
