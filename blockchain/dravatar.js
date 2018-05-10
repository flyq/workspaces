"use strict";

var DictItem = function(text) {
    if (text) {
        var obj = JSON.parse(text);
        this.key = obj.key;
        this.value = obj.value;
    } else {
        this.key = "";
        this.value = "";
    }
};

DictItem.prototype = {
    toString: function () {
        return JSON.stringify(this);
    }
};

var SuperDictionary = function () {
    LocalContractStorage.defineMapProperty(this, "repo", {
        parse: function (text) {
            return new DictItem(text);
        },
        stringify: function (o) {
            return o.toString();
        }
    });
};

SuperDictionary.prototype = {
    init: function () {
        // todo
    },

    save: function (value) {
        value = value.trim();

        var key = Blockchain.transaction.from;
        var dictItem = this.repo.get(key);
        
        if (dictItem){
            this.repo.del(key);
        } 
        
        dictItem = new DictItem();
        dictItem.key = key;
        dictItem.value = value;
        this.repo.put(key, dictItem);
    },

    get: function () {
        var key = Blockchain.transaction.from;
        if ( key === "" ) {
            throw new Error("empty key")
        }
        return this.repo.get(key);
    },
    
    getFromAddress: function(key) {
        key = key.trim();
        
        if ( key === "" ) {
            throw new Error("empty key")
        }
        
        var dictItem = this.repo.get(key);        
        if ( !dictItem ) {
            throw new Error("valid address or this address don't upload")
        }
        
        return this.repo.get(key);
    },
    
    delItem: function() {
        var key = Blockchain.transaction.from;
        var dictItem = this.repo.get(key);
        
        if (dictItem){
            this.repo.del(key);
        } 
};
module.exports = SuperDictionary;
