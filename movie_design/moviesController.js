let Movie=require('./moviesModel')

exports.create = function(req,res){
  console.log(req)
    let movie=new Movie()
movie.name=req.body.name

    movie.save(function(){
    res.json({
        status:'SUCCESS',
        message:'Saved movie successfully'
    })
})

}
exports.listAll = function(req,res){
    res.json([
        {
            id:1,
            name:'Kal Ho NA Ho'
        },
        {
            id:2,
            name:'Kuch Kuch hota hai'   
        },
        {
            id:3,
            name:'Hum sath sath hai'
        },
        {
            id:4,
            name:'Jurassic park'
        }
    ])
}
exports.view = function (req, res) {
    Movie.findById(req.params.id, function (err,movie) {
        if (err)
            res.send(err);
        res.json({
            message: 'Contact details loading..',
            data: movie
        });
    });
};
exports.update = function (req, res) {
    Movie.findById(req.params.id, function (err, movie) {
            if (err)
                res.send(err);
    movie.name = req.body.name ? req.body.name : movie.name;
            
    // save the contact and check for errors
            movie.save(function (err) {
                if (err)
                    res.json(err);
                res.json({
                    message: 'Contact Info updated',
                    data: movie
                });
            });
        });
    };

    exports.delete = function (req, res) {
        Movie.remove({
            _id: req.params.id
        }, function (err,movie) {
            if (err)
                res.send(err);
    res.json({
                status: "success",
                message: 'Movie deleted'
            });
        });
    };

    exports.viewAll = function (req, res) {
        Movie.find(function (err,movie) {
            if (err)
                res.send(err);
            res.json({
                message: 'Contact details loading..',
                data: movie
            });
        });
    };