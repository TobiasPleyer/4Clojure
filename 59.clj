;; Juxtaposition - http://www.4clojure.com/problem/59
(fn [& fs]
  (fn [& args]
    (for [f fs]
      (apply f args))))
