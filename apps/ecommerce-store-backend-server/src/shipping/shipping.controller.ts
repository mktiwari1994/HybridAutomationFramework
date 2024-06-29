import * as common from "@nestjs/common";
import * as swagger from "@nestjs/swagger";
import * as nestAccessControl from "nest-access-control";
import { ShippingService } from "./shipping.service";
import { ShippingControllerBase } from "./base/shipping.controller.base";

@swagger.ApiTags("shippings")
@common.Controller("shippings")
export class ShippingController extends ShippingControllerBase {
  constructor(
    protected readonly service: ShippingService,
    @nestAccessControl.InjectRolesBuilder()
    protected readonly rolesBuilder: nestAccessControl.RolesBuilder
  ) {
    super(service, rolesBuilder);
  }
}
