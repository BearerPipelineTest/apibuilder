/**
 * Generated by API Builder - https://www.apibuilder.io
 * Service version: 0.15.47
 * apibuilder 0.15.33 app.apibuilder.io/apicollective/apibuilder-spec/latest/anorm_2_8_parsers
 */
import anorm._

package io.apibuilder.spec.v0.anorm.parsers {

  import io.apibuilder.spec.v0.anorm.conversions.Standard._

  import io.apibuilder.spec.v0.anorm.conversions.Types._

  object Method {

    def parserWithPrefix(prefix: String, sep: String = "_"): RowParser[io.apibuilder.spec.v0.models.Method] = parser(prefixOpt = Some(s"$prefix$sep"))

    def parser(name: String = "method", prefixOpt: Option[String] = None): RowParser[io.apibuilder.spec.v0.models.Method] = {
      SqlParser.str(prefixOpt.getOrElse("") + name) map {
        case value => io.apibuilder.spec.v0.models.Method(value)
      }
    }

  }

  object ParameterLocation {

    def parserWithPrefix(prefix: String, sep: String = "_"): RowParser[io.apibuilder.spec.v0.models.ParameterLocation] = parser(prefixOpt = Some(s"$prefix$sep"))

    def parser(name: String = "parameter_location", prefixOpt: Option[String] = None): RowParser[io.apibuilder.spec.v0.models.ParameterLocation] = {
      SqlParser.str(prefixOpt.getOrElse("") + name) map {
        case value => io.apibuilder.spec.v0.models.ParameterLocation(value)
      }
    }

  }

  object ResponseCodeOption {

    def parserWithPrefix(prefix: String, sep: String = "_"): RowParser[io.apibuilder.spec.v0.models.ResponseCodeOption] = parser(prefixOpt = Some(s"$prefix$sep"))

    def parser(name: String = "response_code_option", prefixOpt: Option[String] = None): RowParser[io.apibuilder.spec.v0.models.ResponseCodeOption] = {
      SqlParser.str(prefixOpt.getOrElse("") + name) map {
        case value => io.apibuilder.spec.v0.models.ResponseCodeOption(value)
      }
    }

  }

  object Annotation {

    def parserWithPrefix(prefix: String, sep: String = "_"): RowParser[io.apibuilder.spec.v0.models.Annotation] = parser(prefixOpt = Some(s"$prefix$sep"))

    def parser(
      name: String = "name",
      description: String = "description",
      deprecationPrefix: String = "deprecation",
      prefixOpt: Option[String] = None
    ): RowParser[io.apibuilder.spec.v0.models.Annotation] = {
      SqlParser.str(prefixOpt.getOrElse("") + name) ~
      SqlParser.str(prefixOpt.getOrElse("") + description).? ~
      io.apibuilder.spec.v0.anorm.parsers.Deprecation.parserWithPrefix(prefixOpt.getOrElse("") + deprecationPrefix).? map {
        case name ~ description ~ deprecation => {
          io.apibuilder.spec.v0.models.Annotation(
            name = name,
            description = description,
            deprecation = deprecation
          )
        }
      }
    }

  }

  object Apidoc {

    def parserWithPrefix(prefix: String, sep: String = "_"): RowParser[io.apibuilder.spec.v0.models.Apidoc] = parser(prefixOpt = Some(s"$prefix$sep"))

    def parser(
      version: String = "version",
      prefixOpt: Option[String] = None
    ): RowParser[io.apibuilder.spec.v0.models.Apidoc] = {
      SqlParser.str(prefixOpt.getOrElse("") + version) map {
        case version => {
          io.apibuilder.spec.v0.models.Apidoc(
            version = version
          )
        }
      }
    }

  }

  object Application {

    def parserWithPrefix(prefix: String, sep: String = "_"): RowParser[io.apibuilder.spec.v0.models.Application] = parser(prefixOpt = Some(s"$prefix$sep"))

    def parser(
      key: String = "key",
      prefixOpt: Option[String] = None
    ): RowParser[io.apibuilder.spec.v0.models.Application] = {
      SqlParser.str(prefixOpt.getOrElse("") + key) map {
        case key => {
          io.apibuilder.spec.v0.models.Application(
            key = key
          )
        }
      }
    }

  }

  object Attribute {

    def parserWithPrefix(prefix: String, sep: String = "_"): RowParser[io.apibuilder.spec.v0.models.Attribute] = parser(prefixOpt = Some(s"$prefix$sep"))

    def parser(
      name: String = "name",
      value: String = "value",
      description: String = "description",
      deprecationPrefix: String = "deprecation",
      prefixOpt: Option[String] = None
    ): RowParser[io.apibuilder.spec.v0.models.Attribute] = {
      SqlParser.str(prefixOpt.getOrElse("") + name) ~
      SqlParser.get[_root_.play.api.libs.json.JsObject](prefixOpt.getOrElse("") + value) ~
      SqlParser.str(prefixOpt.getOrElse("") + description).? ~
      io.apibuilder.spec.v0.anorm.parsers.Deprecation.parserWithPrefix(prefixOpt.getOrElse("") + deprecationPrefix).? map {
        case name ~ value ~ description ~ deprecation => {
          io.apibuilder.spec.v0.models.Attribute(
            name = name,
            value = value,
            description = description,
            deprecation = deprecation
          )
        }
      }
    }

  }

  object Body {

    def parserWithPrefix(prefix: String, sep: String = "_"): RowParser[io.apibuilder.spec.v0.models.Body] = parser(prefixOpt = Some(s"$prefix$sep"))

    def parser(
      `type`: String = "type",
      description: String = "description",
      deprecationPrefix: String = "deprecation",
      attributes: String = "attributes",
      prefixOpt: Option[String] = None
    ): RowParser[io.apibuilder.spec.v0.models.Body] = {
      SqlParser.str(prefixOpt.getOrElse("") + `type`) ~
      SqlParser.str(prefixOpt.getOrElse("") + description).? ~
      io.apibuilder.spec.v0.anorm.parsers.Deprecation.parserWithPrefix(prefixOpt.getOrElse("") + deprecationPrefix).? ~
      SqlParser.get[Seq[io.apibuilder.spec.v0.models.Attribute]](prefixOpt.getOrElse("") + attributes) map {
        case typeInstance ~ description ~ deprecation ~ attributes => {
          io.apibuilder.spec.v0.models.Body(
            `type` = typeInstance,
            description = description,
            deprecation = deprecation,
            attributes = attributes
          )
        }
      }
    }

  }

  object Contact {

    def parserWithPrefix(prefix: String, sep: String = "_"): RowParser[io.apibuilder.spec.v0.models.Contact] = parser(prefixOpt = Some(s"$prefix$sep"))

    def parser(
      name: String = "name",
      url: String = "url",
      email: String = "email",
      prefixOpt: Option[String] = None
    ): RowParser[io.apibuilder.spec.v0.models.Contact] = {
      SqlParser.str(prefixOpt.getOrElse("") + name).? ~
      SqlParser.str(prefixOpt.getOrElse("") + url).? ~
      SqlParser.str(prefixOpt.getOrElse("") + email).? map {
        case name ~ url ~ email => {
          io.apibuilder.spec.v0.models.Contact(
            name = name,
            url = url,
            email = email
          )
        }
      }
    }

  }

  object Deprecation {

    def parserWithPrefix(prefix: String, sep: String = "_"): RowParser[io.apibuilder.spec.v0.models.Deprecation] = parser(prefixOpt = Some(s"$prefix$sep"))

    def parser(
      description: String = "description",
      prefixOpt: Option[String] = None
    ): RowParser[io.apibuilder.spec.v0.models.Deprecation] = {
      SqlParser.str(prefixOpt.getOrElse("") + description).? map {
        case description => {
          io.apibuilder.spec.v0.models.Deprecation(
            description = description
          )
        }
      }
    }

  }

  object Enum {

    def parserWithPrefix(prefix: String, sep: String = "_"): RowParser[io.apibuilder.spec.v0.models.Enum] = parser(prefixOpt = Some(s"$prefix$sep"))

    def parser(
      name: String = "name",
      plural: String = "plural",
      description: String = "description",
      deprecationPrefix: String = "deprecation",
      values: String = "values",
      attributes: String = "attributes",
      prefixOpt: Option[String] = None
    ): RowParser[io.apibuilder.spec.v0.models.Enum] = {
      SqlParser.str(prefixOpt.getOrElse("") + name) ~
      SqlParser.str(prefixOpt.getOrElse("") + plural) ~
      SqlParser.str(prefixOpt.getOrElse("") + description).? ~
      io.apibuilder.spec.v0.anorm.parsers.Deprecation.parserWithPrefix(prefixOpt.getOrElse("") + deprecationPrefix).? ~
      SqlParser.get[Seq[io.apibuilder.spec.v0.models.EnumValue]](prefixOpt.getOrElse("") + values) ~
      SqlParser.get[Seq[io.apibuilder.spec.v0.models.Attribute]](prefixOpt.getOrElse("") + attributes) map {
        case name ~ plural ~ description ~ deprecation ~ values ~ attributes => {
          io.apibuilder.spec.v0.models.Enum(
            name = name,
            plural = plural,
            description = description,
            deprecation = deprecation,
            values = values,
            attributes = attributes
          )
        }
      }
    }

  }

  object EnumValue {

    def parserWithPrefix(prefix: String, sep: String = "_"): RowParser[io.apibuilder.spec.v0.models.EnumValue] = parser(prefixOpt = Some(s"$prefix$sep"))

    def parser(
      name: String = "name",
      description: String = "description",
      deprecationPrefix: String = "deprecation",
      attributes: String = "attributes",
      value: String = "value",
      prefixOpt: Option[String] = None
    ): RowParser[io.apibuilder.spec.v0.models.EnumValue] = {
      SqlParser.str(prefixOpt.getOrElse("") + name) ~
      SqlParser.str(prefixOpt.getOrElse("") + description).? ~
      io.apibuilder.spec.v0.anorm.parsers.Deprecation.parserWithPrefix(prefixOpt.getOrElse("") + deprecationPrefix).? ~
      SqlParser.get[Seq[io.apibuilder.spec.v0.models.Attribute]](prefixOpt.getOrElse("") + attributes) ~
      SqlParser.str(prefixOpt.getOrElse("") + value).? map {
        case name ~ description ~ deprecation ~ attributes ~ value => {
          io.apibuilder.spec.v0.models.EnumValue(
            name = name,
            description = description,
            deprecation = deprecation,
            attributes = attributes,
            value = value
          )
        }
      }
    }

  }

  object Field {

    def parserWithPrefix(prefix: String, sep: String = "_"): RowParser[io.apibuilder.spec.v0.models.Field] = parser(prefixOpt = Some(s"$prefix$sep"))

    def parser(
      name: String = "name",
      `type`: String = "type",
      description: String = "description",
      deprecationPrefix: String = "deprecation",
      default: String = "default",
      required: String = "required",
      minimum: String = "minimum",
      maximum: String = "maximum",
      example: String = "example",
      attributes: String = "attributes",
      annotations: String = "annotations",
      prefixOpt: Option[String] = None
    ): RowParser[io.apibuilder.spec.v0.models.Field] = {
      SqlParser.str(prefixOpt.getOrElse("") + name) ~
      SqlParser.str(prefixOpt.getOrElse("") + `type`) ~
      SqlParser.str(prefixOpt.getOrElse("") + description).? ~
      io.apibuilder.spec.v0.anorm.parsers.Deprecation.parserWithPrefix(prefixOpt.getOrElse("") + deprecationPrefix).? ~
      SqlParser.str(prefixOpt.getOrElse("") + default).? ~
      SqlParser.bool(prefixOpt.getOrElse("") + required) ~
      SqlParser.long(prefixOpt.getOrElse("") + minimum).? ~
      SqlParser.long(prefixOpt.getOrElse("") + maximum).? ~
      SqlParser.str(prefixOpt.getOrElse("") + example).? ~
      SqlParser.get[Seq[io.apibuilder.spec.v0.models.Attribute]](prefixOpt.getOrElse("") + attributes) ~
      SqlParser.get[Seq[String]](prefixOpt.getOrElse("") + annotations) map {
        case name ~ typeInstance ~ description ~ deprecation ~ default ~ required ~ minimum ~ maximum ~ example ~ attributes ~ annotations => {
          io.apibuilder.spec.v0.models.Field(
            name = name,
            `type` = typeInstance,
            description = description,
            deprecation = deprecation,
            default = default,
            required = required,
            minimum = minimum,
            maximum = maximum,
            example = example,
            attributes = attributes,
            annotations = annotations
          )
        }
      }
    }

  }

  object Header {

    def parserWithPrefix(prefix: String, sep: String = "_"): RowParser[io.apibuilder.spec.v0.models.Header] = parser(prefixOpt = Some(s"$prefix$sep"))

    def parser(
      name: String = "name",
      `type`: String = "type",
      description: String = "description",
      deprecationPrefix: String = "deprecation",
      required: String = "required",
      default: String = "default",
      attributes: String = "attributes",
      prefixOpt: Option[String] = None
    ): RowParser[io.apibuilder.spec.v0.models.Header] = {
      SqlParser.str(prefixOpt.getOrElse("") + name) ~
      SqlParser.str(prefixOpt.getOrElse("") + `type`) ~
      SqlParser.str(prefixOpt.getOrElse("") + description).? ~
      io.apibuilder.spec.v0.anorm.parsers.Deprecation.parserWithPrefix(prefixOpt.getOrElse("") + deprecationPrefix).? ~
      SqlParser.bool(prefixOpt.getOrElse("") + required) ~
      SqlParser.str(prefixOpt.getOrElse("") + default).? ~
      SqlParser.get[Seq[io.apibuilder.spec.v0.models.Attribute]](prefixOpt.getOrElse("") + attributes) map {
        case name ~ typeInstance ~ description ~ deprecation ~ required ~ default ~ attributes => {
          io.apibuilder.spec.v0.models.Header(
            name = name,
            `type` = typeInstance,
            description = description,
            deprecation = deprecation,
            required = required,
            default = default,
            attributes = attributes
          )
        }
      }
    }

  }

  object Import {

    def parserWithPrefix(prefix: String, sep: String = "_"): RowParser[io.apibuilder.spec.v0.models.Import] = parser(prefixOpt = Some(s"$prefix$sep"))

    def parser(
      uri: String = "uri",
      namespace: String = "namespace",
      organizationPrefix: String = "organization",
      applicationPrefix: String = "application",
      version: String = "version",
      enums: String = "enums",
      interfaces: String = "interfaces",
      unions: String = "unions",
      models: String = "models",
      annotations: String = "annotations",
      prefixOpt: Option[String] = None
    ): RowParser[io.apibuilder.spec.v0.models.Import] = {
      SqlParser.str(prefixOpt.getOrElse("") + uri) ~
      SqlParser.str(prefixOpt.getOrElse("") + namespace) ~
      io.apibuilder.spec.v0.anorm.parsers.Organization.parserWithPrefix(prefixOpt.getOrElse("") + organizationPrefix) ~
      io.apibuilder.spec.v0.anorm.parsers.Application.parserWithPrefix(prefixOpt.getOrElse("") + applicationPrefix) ~
      SqlParser.str(prefixOpt.getOrElse("") + version) ~
      SqlParser.get[Seq[String]](prefixOpt.getOrElse("") + enums) ~
      SqlParser.get[Seq[String]](prefixOpt.getOrElse("") + interfaces) ~
      SqlParser.get[Seq[String]](prefixOpt.getOrElse("") + unions) ~
      SqlParser.get[Seq[String]](prefixOpt.getOrElse("") + models) ~
      SqlParser.get[Seq[io.apibuilder.spec.v0.models.Annotation]](prefixOpt.getOrElse("") + annotations) map {
        case uri ~ namespace ~ organization ~ application ~ version ~ enums ~ interfaces ~ unions ~ models ~ annotations => {
          io.apibuilder.spec.v0.models.Import(
            uri = uri,
            namespace = namespace,
            organization = organization,
            application = application,
            version = version,
            enums = enums,
            interfaces = interfaces,
            unions = unions,
            models = models,
            annotations = annotations
          )
        }
      }
    }

  }

  object Info {

    def parserWithPrefix(prefix: String, sep: String = "_"): RowParser[io.apibuilder.spec.v0.models.Info] = parser(prefixOpt = Some(s"$prefix$sep"))

    def parser(
      licensePrefix: String = "license",
      contactPrefix: String = "contact",
      prefixOpt: Option[String] = None
    ): RowParser[io.apibuilder.spec.v0.models.Info] = {
      io.apibuilder.spec.v0.anorm.parsers.License.parserWithPrefix(prefixOpt.getOrElse("") + licensePrefix).? ~
      io.apibuilder.spec.v0.anorm.parsers.Contact.parserWithPrefix(prefixOpt.getOrElse("") + contactPrefix).? map {
        case license ~ contact => {
          io.apibuilder.spec.v0.models.Info(
            license = license,
            contact = contact
          )
        }
      }
    }

  }

  object Interface {

    def parserWithPrefix(prefix: String, sep: String = "_"): RowParser[io.apibuilder.spec.v0.models.Interface] = parser(prefixOpt = Some(s"$prefix$sep"))

    def parser(
      name: String = "name",
      plural: String = "plural",
      description: String = "description",
      deprecationPrefix: String = "deprecation",
      fields: String = "fields",
      attributes: String = "attributes",
      prefixOpt: Option[String] = None
    ): RowParser[io.apibuilder.spec.v0.models.Interface] = {
      SqlParser.str(prefixOpt.getOrElse("") + name) ~
      SqlParser.str(prefixOpt.getOrElse("") + plural) ~
      SqlParser.str(prefixOpt.getOrElse("") + description).? ~
      io.apibuilder.spec.v0.anorm.parsers.Deprecation.parserWithPrefix(prefixOpt.getOrElse("") + deprecationPrefix).? ~
      SqlParser.get[Seq[io.apibuilder.spec.v0.models.Field]](prefixOpt.getOrElse("") + fields) ~
      SqlParser.get[Seq[io.apibuilder.spec.v0.models.Attribute]](prefixOpt.getOrElse("") + attributes) map {
        case name ~ plural ~ description ~ deprecation ~ fields ~ attributes => {
          io.apibuilder.spec.v0.models.Interface(
            name = name,
            plural = plural,
            description = description,
            deprecation = deprecation,
            fields = fields,
            attributes = attributes
          )
        }
      }
    }

  }

  object License {

    def parserWithPrefix(prefix: String, sep: String = "_"): RowParser[io.apibuilder.spec.v0.models.License] = parser(prefixOpt = Some(s"$prefix$sep"))

    def parser(
      name: String = "name",
      url: String = "url",
      prefixOpt: Option[String] = None
    ): RowParser[io.apibuilder.spec.v0.models.License] = {
      SqlParser.str(prefixOpt.getOrElse("") + name) ~
      SqlParser.str(prefixOpt.getOrElse("") + url).? map {
        case name ~ url => {
          io.apibuilder.spec.v0.models.License(
            name = name,
            url = url
          )
        }
      }
    }

  }

  object Model {

    def parserWithPrefix(prefix: String, sep: String = "_"): RowParser[io.apibuilder.spec.v0.models.Model] = parser(prefixOpt = Some(s"$prefix$sep"))

    def parser(
      name: String = "name",
      plural: String = "plural",
      description: String = "description",
      deprecationPrefix: String = "deprecation",
      fields: String = "fields",
      attributes: String = "attributes",
      interfaces: String = "interfaces",
      prefixOpt: Option[String] = None
    ): RowParser[io.apibuilder.spec.v0.models.Model] = {
      SqlParser.str(prefixOpt.getOrElse("") + name) ~
      SqlParser.str(prefixOpt.getOrElse("") + plural) ~
      SqlParser.str(prefixOpt.getOrElse("") + description).? ~
      io.apibuilder.spec.v0.anorm.parsers.Deprecation.parserWithPrefix(prefixOpt.getOrElse("") + deprecationPrefix).? ~
      SqlParser.get[Seq[io.apibuilder.spec.v0.models.Field]](prefixOpt.getOrElse("") + fields) ~
      SqlParser.get[Seq[io.apibuilder.spec.v0.models.Attribute]](prefixOpt.getOrElse("") + attributes) ~
      SqlParser.get[Seq[String]](prefixOpt.getOrElse("") + interfaces) map {
        case name ~ plural ~ description ~ deprecation ~ fields ~ attributes ~ interfaces => {
          io.apibuilder.spec.v0.models.Model(
            name = name,
            plural = plural,
            description = description,
            deprecation = deprecation,
            fields = fields,
            attributes = attributes,
            interfaces = interfaces
          )
        }
      }
    }

  }

  object Operation {

    def parserWithPrefix(prefix: String, sep: String = "_"): RowParser[io.apibuilder.spec.v0.models.Operation] = parser(prefixOpt = Some(s"$prefix$sep"))

    def parser(
      method: String = "method",
      path: String = "path",
      description: String = "description",
      deprecationPrefix: String = "deprecation",
      bodyPrefix: String = "body",
      parameters: String = "parameters",
      responses: String = "responses",
      attributes: String = "attributes",
      prefixOpt: Option[String] = None
    ): RowParser[io.apibuilder.spec.v0.models.Operation] = {
      io.apibuilder.spec.v0.anorm.parsers.Method.parser(prefixOpt.getOrElse("") + method) ~
      SqlParser.str(prefixOpt.getOrElse("") + path) ~
      SqlParser.str(prefixOpt.getOrElse("") + description).? ~
      io.apibuilder.spec.v0.anorm.parsers.Deprecation.parserWithPrefix(prefixOpt.getOrElse("") + deprecationPrefix).? ~
      io.apibuilder.spec.v0.anorm.parsers.Body.parserWithPrefix(prefixOpt.getOrElse("") + bodyPrefix).? ~
      SqlParser.get[Seq[io.apibuilder.spec.v0.models.Parameter]](prefixOpt.getOrElse("") + parameters) ~
      SqlParser.get[Seq[io.apibuilder.spec.v0.models.Response]](prefixOpt.getOrElse("") + responses) ~
      SqlParser.get[Seq[io.apibuilder.spec.v0.models.Attribute]](prefixOpt.getOrElse("") + attributes) map {
        case method ~ path ~ description ~ deprecation ~ body ~ parameters ~ responses ~ attributes => {
          io.apibuilder.spec.v0.models.Operation(
            method = method,
            path = path,
            description = description,
            deprecation = deprecation,
            body = body,
            parameters = parameters,
            responses = responses,
            attributes = attributes
          )
        }
      }
    }

  }

  object Organization {

    def parserWithPrefix(prefix: String, sep: String = "_"): RowParser[io.apibuilder.spec.v0.models.Organization] = parser(prefixOpt = Some(s"$prefix$sep"))

    def parser(
      key: String = "key",
      prefixOpt: Option[String] = None
    ): RowParser[io.apibuilder.spec.v0.models.Organization] = {
      SqlParser.str(prefixOpt.getOrElse("") + key) map {
        case key => {
          io.apibuilder.spec.v0.models.Organization(
            key = key
          )
        }
      }
    }

  }

  object Parameter {

    def parserWithPrefix(prefix: String, sep: String = "_"): RowParser[io.apibuilder.spec.v0.models.Parameter] = parser(prefixOpt = Some(s"$prefix$sep"))

    def parser(
      name: String = "name",
      `type`: String = "type",
      location: String = "location",
      description: String = "description",
      deprecationPrefix: String = "deprecation",
      required: String = "required",
      default: String = "default",
      minimum: String = "minimum",
      maximum: String = "maximum",
      example: String = "example",
      attributes: String = "attributes",
      prefixOpt: Option[String] = None
    ): RowParser[io.apibuilder.spec.v0.models.Parameter] = {
      SqlParser.str(prefixOpt.getOrElse("") + name) ~
      SqlParser.str(prefixOpt.getOrElse("") + `type`) ~
      io.apibuilder.spec.v0.anorm.parsers.ParameterLocation.parser(prefixOpt.getOrElse("") + location) ~
      SqlParser.str(prefixOpt.getOrElse("") + description).? ~
      io.apibuilder.spec.v0.anorm.parsers.Deprecation.parserWithPrefix(prefixOpt.getOrElse("") + deprecationPrefix).? ~
      SqlParser.bool(prefixOpt.getOrElse("") + required) ~
      SqlParser.str(prefixOpt.getOrElse("") + default).? ~
      SqlParser.long(prefixOpt.getOrElse("") + minimum).? ~
      SqlParser.long(prefixOpt.getOrElse("") + maximum).? ~
      SqlParser.str(prefixOpt.getOrElse("") + example).? ~
      SqlParser.get[Seq[io.apibuilder.spec.v0.models.Attribute]](prefixOpt.getOrElse("") + attributes).? map {
        case name ~ typeInstance ~ location ~ description ~ deprecation ~ required ~ default ~ minimum ~ maximum ~ example ~ attributes => {
          io.apibuilder.spec.v0.models.Parameter(
            name = name,
            `type` = typeInstance,
            location = location,
            description = description,
            deprecation = deprecation,
            required = required,
            default = default,
            minimum = minimum,
            maximum = maximum,
            example = example,
            attributes = attributes
          )
        }
      }
    }

  }

  object Resource {

    def parserWithPrefix(prefix: String, sep: String = "_"): RowParser[io.apibuilder.spec.v0.models.Resource] = parser(prefixOpt = Some(s"$prefix$sep"))

    def parser(
      `type`: String = "type",
      plural: String = "plural",
      path: String = "path",
      description: String = "description",
      deprecationPrefix: String = "deprecation",
      operations: String = "operations",
      attributes: String = "attributes",
      prefixOpt: Option[String] = None
    ): RowParser[io.apibuilder.spec.v0.models.Resource] = {
      SqlParser.str(prefixOpt.getOrElse("") + `type`) ~
      SqlParser.str(prefixOpt.getOrElse("") + plural) ~
      SqlParser.str(prefixOpt.getOrElse("") + path).? ~
      SqlParser.str(prefixOpt.getOrElse("") + description).? ~
      io.apibuilder.spec.v0.anorm.parsers.Deprecation.parserWithPrefix(prefixOpt.getOrElse("") + deprecationPrefix).? ~
      SqlParser.get[Seq[io.apibuilder.spec.v0.models.Operation]](prefixOpt.getOrElse("") + operations) ~
      SqlParser.get[Seq[io.apibuilder.spec.v0.models.Attribute]](prefixOpt.getOrElse("") + attributes) map {
        case typeInstance ~ plural ~ path ~ description ~ deprecation ~ operations ~ attributes => {
          io.apibuilder.spec.v0.models.Resource(
            `type` = typeInstance,
            plural = plural,
            path = path,
            description = description,
            deprecation = deprecation,
            operations = operations,
            attributes = attributes
          )
        }
      }
    }

  }

  object Response {

    def parserWithPrefix(prefix: String, sep: String = "_"): RowParser[io.apibuilder.spec.v0.models.Response] = parser(prefixOpt = Some(s"$prefix$sep"))

    def parser(
      codePrefix: String = "code",
      `type`: String = "type",
      headers: String = "headers",
      description: String = "description",
      deprecationPrefix: String = "deprecation",
      attributes: String = "attributes",
      prefixOpt: Option[String] = None
    ): RowParser[io.apibuilder.spec.v0.models.Response] = {
      io.apibuilder.spec.v0.anorm.parsers.ResponseCode.parserWithPrefix(prefixOpt.getOrElse("") + codePrefix) ~
      SqlParser.str(prefixOpt.getOrElse("") + `type`) ~
      SqlParser.get[Seq[io.apibuilder.spec.v0.models.Header]](prefixOpt.getOrElse("") + headers).? ~
      SqlParser.str(prefixOpt.getOrElse("") + description).? ~
      io.apibuilder.spec.v0.anorm.parsers.Deprecation.parserWithPrefix(prefixOpt.getOrElse("") + deprecationPrefix).? ~
      SqlParser.get[Seq[io.apibuilder.spec.v0.models.Attribute]](prefixOpt.getOrElse("") + attributes).? map {
        case code ~ typeInstance ~ headers ~ description ~ deprecation ~ attributes => {
          io.apibuilder.spec.v0.models.Response(
            code = code,
            `type` = typeInstance,
            headers = headers,
            description = description,
            deprecation = deprecation,
            attributes = attributes
          )
        }
      }
    }

  }

  object Service {

    def parserWithPrefix(prefix: String, sep: String = "_"): RowParser[io.apibuilder.spec.v0.models.Service] = parser(prefixOpt = Some(s"$prefix$sep"))

    def parser(
      apidocPrefix: String = "apidoc",
      name: String = "name",
      organizationPrefix: String = "organization",
      applicationPrefix: String = "application",
      namespace: String = "namespace",
      version: String = "version",
      baseUrl: String = "base_url",
      description: String = "description",
      infoPrefix: String = "info",
      headers: String = "headers",
      imports: String = "imports",
      enums: String = "enums",
      interfaces: String = "interfaces",
      unions: String = "unions",
      models: String = "models",
      resources: String = "resources",
      attributes: String = "attributes",
      annotations: String = "annotations",
      prefixOpt: Option[String] = None
    ): RowParser[io.apibuilder.spec.v0.models.Service] = {
      io.apibuilder.spec.v0.anorm.parsers.Apidoc.parserWithPrefix(prefixOpt.getOrElse("") + apidocPrefix) ~
      SqlParser.str(prefixOpt.getOrElse("") + name) ~
      io.apibuilder.spec.v0.anorm.parsers.Organization.parserWithPrefix(prefixOpt.getOrElse("") + organizationPrefix) ~
      io.apibuilder.spec.v0.anorm.parsers.Application.parserWithPrefix(prefixOpt.getOrElse("") + applicationPrefix) ~
      SqlParser.str(prefixOpt.getOrElse("") + namespace) ~
      SqlParser.str(prefixOpt.getOrElse("") + version) ~
      SqlParser.str(prefixOpt.getOrElse("") + baseUrl).? ~
      SqlParser.str(prefixOpt.getOrElse("") + description).? ~
      io.apibuilder.spec.v0.anorm.parsers.Info.parserWithPrefix(prefixOpt.getOrElse("") + infoPrefix) ~
      SqlParser.get[Seq[io.apibuilder.spec.v0.models.Header]](prefixOpt.getOrElse("") + headers) ~
      SqlParser.get[Seq[io.apibuilder.spec.v0.models.Import]](prefixOpt.getOrElse("") + imports) ~
      SqlParser.get[Seq[io.apibuilder.spec.v0.models.Enum]](prefixOpt.getOrElse("") + enums) ~
      SqlParser.get[Seq[io.apibuilder.spec.v0.models.Interface]](prefixOpt.getOrElse("") + interfaces) ~
      SqlParser.get[Seq[io.apibuilder.spec.v0.models.Union]](prefixOpt.getOrElse("") + unions) ~
      SqlParser.get[Seq[io.apibuilder.spec.v0.models.Model]](prefixOpt.getOrElse("") + models) ~
      SqlParser.get[Seq[io.apibuilder.spec.v0.models.Resource]](prefixOpt.getOrElse("") + resources) ~
      SqlParser.get[Seq[io.apibuilder.spec.v0.models.Attribute]](prefixOpt.getOrElse("") + attributes) ~
      SqlParser.get[Seq[io.apibuilder.spec.v0.models.Annotation]](prefixOpt.getOrElse("") + annotations) map {
        case apidoc ~ name ~ organization ~ application ~ namespace ~ version ~ baseUrl ~ description ~ info ~ headers ~ imports ~ enums ~ interfaces ~ unions ~ models ~ resources ~ attributes ~ annotations => {
          io.apibuilder.spec.v0.models.Service(
            apidoc = apidoc,
            name = name,
            organization = organization,
            application = application,
            namespace = namespace,
            version = version,
            baseUrl = baseUrl,
            description = description,
            info = info,
            headers = headers,
            imports = imports,
            enums = enums,
            interfaces = interfaces,
            unions = unions,
            models = models,
            resources = resources,
            attributes = attributes,
            annotations = annotations
          )
        }
      }
    }

  }

  object Union {

    def parserWithPrefix(prefix: String, sep: String = "_"): RowParser[io.apibuilder.spec.v0.models.Union] = parser(prefixOpt = Some(s"$prefix$sep"))

    def parser(
      name: String = "name",
      plural: String = "plural",
      discriminator: String = "discriminator",
      description: String = "description",
      deprecationPrefix: String = "deprecation",
      types: String = "types",
      attributes: String = "attributes",
      interfaces: String = "interfaces",
      prefixOpt: Option[String] = None
    ): RowParser[io.apibuilder.spec.v0.models.Union] = {
      SqlParser.str(prefixOpt.getOrElse("") + name) ~
      SqlParser.str(prefixOpt.getOrElse("") + plural) ~
      SqlParser.str(prefixOpt.getOrElse("") + discriminator).? ~
      SqlParser.str(prefixOpt.getOrElse("") + description).? ~
      io.apibuilder.spec.v0.anorm.parsers.Deprecation.parserWithPrefix(prefixOpt.getOrElse("") + deprecationPrefix).? ~
      SqlParser.get[Seq[io.apibuilder.spec.v0.models.UnionType]](prefixOpt.getOrElse("") + types) ~
      SqlParser.get[Seq[io.apibuilder.spec.v0.models.Attribute]](prefixOpt.getOrElse("") + attributes) ~
      SqlParser.get[Seq[String]](prefixOpt.getOrElse("") + interfaces) map {
        case name ~ plural ~ discriminator ~ description ~ deprecation ~ types ~ attributes ~ interfaces => {
          io.apibuilder.spec.v0.models.Union(
            name = name,
            plural = plural,
            discriminator = discriminator,
            description = description,
            deprecation = deprecation,
            types = types,
            attributes = attributes,
            interfaces = interfaces
          )
        }
      }
    }

  }

  object UnionType {

    def parserWithPrefix(prefix: String, sep: String = "_"): RowParser[io.apibuilder.spec.v0.models.UnionType] = parser(prefixOpt = Some(s"$prefix$sep"))

    def parser(
      `type`: String = "type",
      description: String = "description",
      deprecationPrefix: String = "deprecation",
      attributes: String = "attributes",
      default: String = "default",
      discriminatorValue: String = "discriminator_value",
      prefixOpt: Option[String] = None
    ): RowParser[io.apibuilder.spec.v0.models.UnionType] = {
      SqlParser.str(prefixOpt.getOrElse("") + `type`) ~
      SqlParser.str(prefixOpt.getOrElse("") + description).? ~
      io.apibuilder.spec.v0.anorm.parsers.Deprecation.parserWithPrefix(prefixOpt.getOrElse("") + deprecationPrefix).? ~
      SqlParser.get[Seq[io.apibuilder.spec.v0.models.Attribute]](prefixOpt.getOrElse("") + attributes) ~
      SqlParser.bool(prefixOpt.getOrElse("") + default).? ~
      SqlParser.str(prefixOpt.getOrElse("") + discriminatorValue).? map {
        case typeInstance ~ description ~ deprecation ~ attributes ~ default ~ discriminatorValue => {
          io.apibuilder.spec.v0.models.UnionType(
            `type` = typeInstance,
            description = description,
            deprecation = deprecation,
            attributes = attributes,
            default = default,
            discriminatorValue = discriminatorValue
          )
        }
      }
    }

  }

  object ResponseCode {

    def parserWithPrefix(prefix: String, sep: String = "_") = {
      SqlParser.int(s"$prefix${sep}response_code").map(io.apibuilder.spec.v0.models.ResponseCodeInt.apply) |
      io.apibuilder.spec.v0.anorm.parsers.ResponseCodeOption.parser("response_code", Some(s"$prefix$sep"))
    }

    def parser() = {
      SqlParser.int("response_code").map(io.apibuilder.spec.v0.models.ResponseCodeInt.apply) |
      io.apibuilder.spec.v0.anorm.parsers.ResponseCodeOption.parser("response_code")
    }

  }

}