;; Function Composition - http://www.4clojure.com/problem/58
(fn [& fs]
  (fn [& s]
    (cond
      (= 0 (count fs)) s
      (= 1 (count fs)) (apply (first fs) s)
      :else (let [reversed-fs (reverse fs)
                  first-application (apply (first reversed-fs) s)]
              (reduce (fn [x f] (f x)) first-application (rest reversed-fs))))))
